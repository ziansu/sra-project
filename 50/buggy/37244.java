protected final java.lang.String getHeader(java.lang.String tag) {
    try {
        return req.getHeader(tag);
    } catch (java.lang.Exception e) {
        return null;
    }
}