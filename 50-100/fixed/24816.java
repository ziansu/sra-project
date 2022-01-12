private void saveListToFile(java.util.List<java.util.List<java.lang.Number>> newList, java.lang.String name) {
    try (java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.FileWriter(new java.io.File(name)))) {
        writeList(newList, bw);
    } catch (java.io.IOException e) {
        com.alphatica.genotick.data.DataException dataException = new com.alphatica.genotick.data.DataException(("Unable to write file " + name));
        dataException.initCause(e);
        throw dataException;
    }
}