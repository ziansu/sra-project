public static int printData(java.lang.String[] args) throws com.fasterxml.jackson.core.JsonProcessingException, java.lang.NullPointerException {
    org.paces.Stata.Data.Meta dbg = new org.paces.Stata.Data.Meta(args);
    org.paces.Stata.Data.DataSet stataData = new org.paces.Stata.Data.DataSet(dbg);
    org.paces.Stata.JSON.StataJSON.toJSON(stataData);
    stataData = null;
    dbg = null;
    return 0;
}