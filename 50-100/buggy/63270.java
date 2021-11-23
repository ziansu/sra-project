private java.util.List<java.util.List<java.lang.Number>> buildOriginalList(java.lang.String name) {
    java.lang.String filePath = ((path) + (java.io.File.separator)) + name;
    try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(new java.io.File(filePath)))) {
        ignoreFirstLine(br);
        return com.alphatica.genotick.data.DataUtils.createLineList(br);
    } catch (java.io.IOException e) {
        com.alphatica.genotick.data.DataException dataException = new com.alphatica.genotick.data.DataException(("Unable to read file " + filePath));
        dataException.initCause(e);
        throw dataException;
    }
}