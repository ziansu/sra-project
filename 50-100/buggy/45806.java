public static java.lang.Object transformBytesToObject(final byte[] data, final azkaban.database.EncodingType encType) throws java.io.IOException {
    final java.lang.Object flowObj;
    if (encType == (azkaban.database.EncodingType.GZIP)) {
        final java.lang.String jsonString = azkaban.utils.GZIPUtils.unGzipString(data, "UTF-8");
        flowObj = azkaban.utils.JSONUtils.parseJSONFromString(jsonString);
    }else {
        final java.lang.String jsonString = new java.lang.String(data, "UTF-8");
        flowObj = azkaban.utils.JSONUtils.parseJSONFromString(jsonString);
    }
    return flowObj;
}