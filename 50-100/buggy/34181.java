public void save(java.lang.String outputFilePath) throws java.io.FileNotFoundException, java.io.IOException {
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    java.io.OutputStreamWriter out = new java.io.OutputStreamWriter(it.uniroma2.sag.kelp.utils.FileUtils.createOutputStream(outputFilePath), "utf8");
    mapper.writeValue(out, kernel);
    out.close();
}