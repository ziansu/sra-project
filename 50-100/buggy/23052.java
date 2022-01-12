@com.fasterxml.jackson.annotation.JsonPropertyOrder(value = { "name" , "values" , "first record id" , "last record id" , "number of records" , "variable indices" , "number of variables" , "variable type string" , "variable names" , "variable labels" , "value label names" , "value labels" })
public static int printAllToFile(java.lang.String[] args) throws com.fasterxml.jackson.core.JsonProcessingException, java.io.IOException {
    org.paces.Stata.JSON.StataAllToJSON allData = new org.paces.Stata.JSON.StataAllToJSON(args);
    java.io.FileOutputStream jsonOutput = new java.io.FileOutputStream(com.stata.sfi.Macro.getLocalSafe("filenm"));
    org.paces.Stata.JSON.StataJSON.toJSON(allData.getData(), jsonOutput);
    jsonOutput.close();
    allData = null;
    return 0;
}