public com.google.common.geometry.S2Region read(java.lang.String wellKnownText) throws java.lang.IllegalArgumentException {
    try (java.io.StringReader reader = new java.io.StringReader(wellKnownText)) {
        return read(reader);
    }
}