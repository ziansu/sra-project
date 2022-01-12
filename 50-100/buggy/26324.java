private void writeToFile(java.io.File oFile, java.lang.String data) {
    try {
        java.io.FileWriter writer = new java.io.FileWriter(oFile);
        writer.append(data);
        writer.flush();
        writer.close();
        java.lang.System.out.println(("File saved in " + (oFile.getAbsolutePath())));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}