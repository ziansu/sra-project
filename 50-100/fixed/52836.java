public static void MarshallToJSON(java.io.PrintStream stream, generated.People people) throws java.io.IOException {
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule module = new com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule();
    mapper.registerModule(module);
    mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
    mapper.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, true);
    mapper.writeValue(stream, people);
}