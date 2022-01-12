private static void readAndParse(java.io.BufferedReader reader, java.lang.String className) throws java.io.IOException {
    Parser parser = new Parser();
    java.lang.String text;
    while ((text = reader.readLine()) != null) {
        parser.getVmLines().add(text);
    } 
    parser.parseVmFile(className);
}