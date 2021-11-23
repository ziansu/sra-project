public static void toJSON(org.paces.Stata.DataRecords.DataRecord observation, java.lang.Integer maclen) throws com.fasterxml.jackson.core.JsonProcessingException {
    com.fasterxml.jackson.databind.ObjectMapper themap = new com.fasterxml.jackson.databind.ObjectMapper();
    java.lang.String thejson = themap.writeValueAsString(observation);
    if ((thejson.length()) <= maclen) {
        org.paces.Stata.JSON.Macro.setLocal("thejson", thejson);
    }
    org.paces.Stata.JSON.SFIToolkit.display(themap.writerWithDefaultPrettyPrinter().writeValueAsString(observation));
}