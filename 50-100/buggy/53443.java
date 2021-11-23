public java.lang.String serialize(com.microsoft.telemetry.IJsonSerializable event) {
    java.io.StringWriter writer = new java.io.StringWriter();
    try {
        event.serialize(writer);
    } catch (java.io.IOException e) {
        logger.error(TAG, "IOException when serializing");
    }
    java.lang.String serialized = (writer.toString()) + "\r\n";
    return serialized;
}