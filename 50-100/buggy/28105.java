@com.fasterxml.jackson.annotation.JsonPropertyOrder(value = { "source" , "name" , "values" })
public static int printDataToFile(java.lang.String[] args) throws com.fasterxml.jackson.core.JsonProcessingException, java.io.IOException {
    org.paces.Stata.Data.Meta dbg = new org.paces.Stata.Data.Meta(args);
    org.paces.Stata.Data.StataData stataData = new org.paces.Stata.Data.DataSet(dbg);
    java.io.FileOutputStream jsonOutput = new java.io.FileOutputStream(com.stata.sfi.Macro.getLocalSafe("filenm"));
    org.paces.Stata.JSON.StataJSON.toJSON(stataData, jsonOutput);
    jsonOutput.close();
    stataData = null;
    dbg = null;
    return 0;
}