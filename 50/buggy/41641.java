private void loadFromInternFile() throws java.lang.NumberFormatException {
    java.lang.System.out.println("Intern");
    java.io.InputStream inStream = this.getClass().getResourceAsStream(org.bham.aucom.Configuration.resourcePath);
    loadFromBuffer(new java.io.BufferedReader(new java.io.InputStreamReader(inStream)));
}