@com.fasterxml.jackson.annotation.JsonPropertyOrder(value = { "name" , "values" , "first record id" , "last record id" , "number of records" , "variable indices" , "number of variables" , "variable type string" , "variable names" , "variable labels" , "value label names" , "value labels" })
public static int printAll(java.lang.String[] args) throws com.fasterxml.jackson.core.JsonProcessingException, java.lang.NullPointerException {
    org.paces.Stata.JSON.StataAllToJSON allData = new org.paces.Stata.JSON.StataAllToJSON(args);
    org.paces.Stata.JSON.StataJSON.toJSON(allData.getData());
    allData = null;
    return 0;
}