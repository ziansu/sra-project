public void saveReport(java.lang.String filename) throws invalidNameException, invalidTableIdException, java.io.IOException, java.lang.ArrayIndexOutOfBoundsException {
    java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.FileWriter(filename));
    bw.write(this.getMenu());
    bw.write(this.getFrequency());
    bw.write(this.getBills());
    bw.close();
}