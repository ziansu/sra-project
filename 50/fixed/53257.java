public void serializeToFile(java.io.File file) throws com.fasterxml.jackson.core.JsonGenerationException, com.fasterxml.jackson.databind.JsonMappingException, java.io.IOException {
    writer.writeValue(file, results);
}