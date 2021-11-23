@java.lang.Override
public java.lang.String toString() {
    if ((requestPayload) == null) {
        return null;
    }
    java.nio.charset.Charset charsetObj = null;
    if (((charset) == null) || ("".equals(charset.trim()))) {
        charsetObj = java.nio.charset.Charset.forName(com.fasterxml.jackson.core.util.RequestPayloadWrapper.DEFAULT_CHARSET);
    }else {
        charsetObj = java.nio.charset.Charset.forName(charset);
    }
    return new java.lang.String(requestPayload, charsetObj);
}