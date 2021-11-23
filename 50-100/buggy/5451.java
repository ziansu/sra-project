public final java.lang.Object readObject(java.net.URL locationArgument, org.apache.pivot.util.Resources resourcesArgument) throws java.io.IOException, org.apache.pivot.serialization.SerializationException {
    if (locationArgument == null) {
        throw new java.lang.IllegalArgumentException("location is null.");
    }
    this.location = locationArgument;
    this.resources = resourcesArgument;
    java.io.InputStream inputStream = new java.io.BufferedInputStream(locationArgument.openStream());
    java.lang.Object object;
    try {
        object = readObject(inputStream);
    } finally {
        inputStream.close();
    }
    this.location = null;
    this.resources = null;
    return object;
}