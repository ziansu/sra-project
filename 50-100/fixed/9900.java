private void fromPayload(java.lang.String partContent) {
    java.lang.String[] parts = partContent.split(Constants.CRLFCRLF, 2);
    if (2 == (parts.length)) {
        parseHeaders(parts[0]);
        mContent = parts[1].substring(0, parts[1].lastIndexOf(Constants.CRLF));
    }
}