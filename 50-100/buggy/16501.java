public static java.lang.String getFileContents(final java.lang.String filename) throws java.io.IOException {
    final java.lang.StringBuilder buf = new java.lang.StringBuilder();
    final java.io.FileReader in = new java.io.FileReader(filename);
    final java.io.BufferedReader br = new java.io.BufferedReader(in);
    java.lang.String line;
    while ((line = br.readLine()) != null) {
        buf.append(line);
        buf.append(com.leonarduk.webscraper.core.FileUtils.CARRIAGE_RETURN);
    } 
    in.close();
    return buf.toString().trim();
}