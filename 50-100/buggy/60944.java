public static void MarshallToJSON(java.lang.String fileName, generated.People people) throws java.io.IOException {
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule module = new com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule();
    mapper.registerModule(module);
    mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
    mapper.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, true);
    java.lang.String result = mapper.writeValueAsString(people);
    java.lang.System.out.println(result);
    mapper.writeValue(new java.io.File("people.json"), people);
}