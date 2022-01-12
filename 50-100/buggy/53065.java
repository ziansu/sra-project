private java.lang.String getFirstLine() throws java.io.IOException {
    try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(file))) {
        if (!(br.ready())) {
            return "";
        }else {
            java.lang.String line = br.readLine();
            return line;
        }
    } catch (java.io.IOException ioe) {
        throw ioe;
    }
}