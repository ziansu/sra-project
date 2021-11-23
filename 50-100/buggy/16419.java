private java.lang.String generateId(final java.lang.String currentId, final java.lang.String seed) {
    if (seed == null) {
        return java.util.UUID.randomUUID().toString();
    }else {
        return java.util.UUID.nameUUIDFromBytes(seed.getBytes(java.nio.charset.StandardCharsets.UTF_8)).toString();
    }
}