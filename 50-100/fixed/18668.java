public void addHeader(java.lang.String name, java.lang.String value) {
    if (server.MessageHeaders.SET_COOKIE_NAME.equals(name)) {
        addCookie(value);
        return ;
    }
    if (headers.containsKey(name)) {
        java.lang.String message = java.lang.String.format("Header name: \"%s\" is already in use.", name);
        throw new server.MessageHeaders.DuplicateHeaderException(message);
    }
    headers.put(name, value);
}