public com.google.common.geometry.S2Region read(java.lang.String wellKnownText) throws java.lang.IllegalArgumentException {
    java.io.StringReader reader = new java.io.StringReader(wellKnownText);
    try {
        return read(reader);
    } finally {
        reader.close();
    }
}