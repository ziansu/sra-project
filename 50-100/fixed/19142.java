public void load_parameters(java.lang.String simfile) throws java.io.FileNotFoundException, java.io.IOException, java.lang.ClassNotFoundException {
    java.io.FileInputStream fis = new java.io.FileInputStream(simfile);
    java.util.zip.GZIPInputStream gis = new java.util.zip.GZIPInputStream(fis);
    java.io.ObjectInputStream ois = new java.io.ObjectInputStream(gis);
    simulation = ((simulator.control.Simulation) (ois.readObject())).clone();
    is_saved = true;
    ois.close();
}