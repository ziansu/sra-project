private byte[] getAssembledBytes() throws java.lang.Exception {
    try {
        compile();
        link();
        return java.nio.file.Files.readAllBytes(binaryFile);
    } finally {
        cleanAuxiliaryFiles();
    }
}