public void resetReader() throws java.io.FileNotFoundException {
    try {
        br.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    br = new java.io.BufferedReader(new java.io.FileReader(f));
}