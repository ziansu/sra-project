public static java.util.stream.Stream<com.crudui.dto.UiFormJSON> getUiFormJSONs(java.lang.String metadataLocation) {
    if ((com.crudui.dto.UiFormJSONSingleton.uiFormJSONs) == null) {
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        com.crudui.dto.UiFormJSON[] uiFormJSONArr;
        try {
            com.crudui.dto.UiFormJSONSingleton.uiFormJSONs = mapper.readValue(new java.io.File(metadataLocation), com.crudui.dto.UiFormJSON[].class);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    return java.util.Arrays.asList(com.crudui.dto.UiFormJSONSingleton.uiFormJSONs).stream();
}