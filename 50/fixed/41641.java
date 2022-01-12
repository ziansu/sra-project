private void loadFromInternFile() {
    java.lang.System.out.println("Intern");
    java.io.InputStream inStream = getClass().getResourceAsStream(org.bham.aucom.Configuration.resourcePath);
    loadFromBuffer(new java.io.BufferedReader(new java.io.InputStreamReader(inStream)));
}