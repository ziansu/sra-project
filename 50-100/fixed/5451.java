public final java.lang.Object readObject(java.net.URL locationArgument, org.apache.pivot.util.Resources resourcesArgument) throws java.io.IOException, org.apache.pivot.serialization.SerializationException {
    if (locationArgument == null) {
        throw new java.lang.IllegalArgumentException("location is null.");
    }
    this.location = locationArgument;
    this.resources = resourcesArgument;
    java.lang.Object object;
    try (java.io.InputStream inputStream = new java.io.BufferedInputStream(locationArgument.openStream())) {
        object = readObject(inputStream);
    }
    this.location = null;
    this.resources = null;
    return object;
}