public static java.lang.String get(java.lang.String def) {
    com.kepler.header.Headers headers = ThreadHeaders.HEADERS.get();
    return headers != null ? headers.get(com.kepler.header.impl.UserContext.KEY, def) : def;
}