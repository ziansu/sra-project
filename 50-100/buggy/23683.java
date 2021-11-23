protected java.lang.Object convertToObject(java.lang.String body, java.lang.String contentType) throws asia.stampy.common.parsing.IllegalObjectException, java.io.IOException, java.lang.ClassNotFoundException {
    if (!(AbstractBodyMessage.JAVA_BASE64_MIME_TYPE.equals(contentType))) {
        throw new org.apache.commons.lang.NotImplementedException(("Subclass this class and override convertToObject to enable conversion using mime type " + contentType));
    }
    java.lang.Object o = asia.stampy.common.serialization.SerializationUtils.deserializeBase64(body);
    illegalObjectCheck(o);
    return o;
}