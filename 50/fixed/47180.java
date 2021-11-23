public static java.lang.String[] getHeaders(java.lang.String pathHeader, java.lang.String delimiter, ml.shifu.shifu.container.obj.RawSourceData.SourceType sourceType) throws java.io.IOException {
    return ml.shifu.shifu.util.CommonUtils.getHeaders(pathHeader, delimiter, sourceType, false);
}