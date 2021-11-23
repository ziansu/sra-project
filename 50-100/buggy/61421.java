public static void toJSON(org.paces.Stata.DataRecords.DataRecord observation, java.io.FileOutputStream filename, java.lang.Integer maclen) throws com.fasterxml.jackson.core.JsonProcessingException, java.io.IOException {
    com.fasterxml.jackson.databind.ObjectMapper themap = new com.fasterxml.jackson.databind.ObjectMapper();
    java.lang.String thejson = themap.writeValueAsString(observation);
    if ((thejson.length()) <= maclen) {
        org.paces.Stata.JSON.Macro.setLocal("thejson", thejson);
    }
    themap.writerWithDefaultPrettyPrinter().writeValue(filename, observation);
}