public static com.palantir.atlasdb.keyvalue.api.BatchColumnRangeSelection valueOf(java.lang.String serialized) {
    java.lang.String[] split = com.palantir.atlasdb.keyvalue.api.BatchColumnRangeSelection.deserializeRegex.split(serialized);
    byte[] startCol = com.palantir.atlasdb.encoding.PtBytes.decodeBase64(split[0]);
    byte[] endCol = com.palantir.atlasdb.encoding.PtBytes.decodeBase64(split[1]);
    int batchHint = java.lang.Integer.valueOf(split[2]);
    return new com.palantir.atlasdb.keyvalue.api.BatchColumnRangeSelection(startCol, endCol, batchHint);
}