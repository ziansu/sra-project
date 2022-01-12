public static java.lang.String truncateSimpleID(java.lang.String completeVarID) {
    java.lang.String simpleID = completeVarID.substring(0, completeVarID.indexOf(":"));
    return simpleID;
}