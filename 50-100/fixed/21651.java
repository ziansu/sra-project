public static java.util.List<java.lang.String[]> read(java.lang.String filename, java.io.InputStream inputStream, int startRow) throws java.io.IOException {
    if (inputStream == null) {
        throw new java.lang.IllegalArgumentException("inputStream is null");
    }
    return com.hust.mining.util.ExcelUtil.read(filename, inputStream, startRow, (-1), null);
}