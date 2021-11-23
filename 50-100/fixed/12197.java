public static int printRecord(java.lang.String[] args) throws com.fasterxml.jackson.core.JsonProcessingException, java.lang.NullPointerException {
    org.paces.Stata.Data.Meta dbg = new org.paces.Stata.Data.Meta(args);
    java.lang.Long obid = java.lang.Long.valueOf(com.stata.sfi.Macro.getLocalSafe("obid"));
    org.paces.Stata.Data.DataRecord x = new org.paces.Stata.Data.DataRecord(obid, dbg);
    org.paces.Stata.JSON.StataJSON.toJSON(x);
    x = null;
    obid = null;
    dbg = null;
    return 0;
}