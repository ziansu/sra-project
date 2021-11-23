protected java.lang.Object convertToObject(java.lang.String body, java.lang.String contentType) throws asia.stampy.common.parsing.IllegalObjectException, java.io.IOException, java.lang.ClassNotFoundException {
    if (!(AbstractBodyMessage.JAVA_BASE64_MIME_TYPE.equals(contentType))) {
        return body;
    }
    java.lang.Object o = asia.stampy.common.serialization.SerializationUtils.deserializeBase64(body);
    illegalObjectCheck(o);
    return o;
}