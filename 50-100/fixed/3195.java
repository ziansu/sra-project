public void saveReport(java.lang.String filename) throws invalidNameException, invalidTableIdException, java.io.IOException, java.lang.ArrayIndexOutOfBoundsException {
    java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.FileWriter(filename));
    bw.write(((this.getMenu()) + "\n"));
    bw.write(((this.getFrequency()) + "\n"));
    bw.write(this.getBills());
    bw.close();
}