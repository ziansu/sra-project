public static int printAllToFile(java.lang.String[] args) throws com.fasterxml.jackson.core.JsonProcessingException, java.io.IOException {
    org.paces.Stata.JSON.StataAllToJSON allData = new org.paces.Stata.JSON.StataAllToJSON(args);
    java.io.FileOutputStream jsonOutput = new java.io.FileOutputStream(com.stata.sfi.Macro.getLocalSafe("filenm"));
    org.paces.Stata.JSON.StataJSON.toJSON(allData, jsonOutput);
    jsonOutput.close();
    allData = null;
    return 0;
}