private static java.lang.String getResultFilePath(java.util.Map map) {
    final java.lang.String rootDir = ch.epfl.data.squall.utilities.LocalMergeResults.getResultDir(map);
    final java.lang.String schemaName = ch.epfl.data.squall.utilities.LocalMergeResults.getSchemaName(map);
    final java.lang.String dataSize = ch.epfl.data.squall.utilities.LocalMergeResults.getDataSizeInfo(map);
    final java.lang.String queryName = ch.epfl.data.squall.utilities.SystemParameters.getString(map, "DIP_QUERY_NAME");
    return ((((((rootDir + "/") + schemaName) + "/") + dataSize) + "/") + queryName) + ".result";
}