public com.squareup.okhttp.HttpUrl.Builder newBuilder() {
    com.squareup.okhttp.HttpUrl.Builder result = new com.squareup.okhttp.HttpUrl.Builder();
    result.scheme = scheme;
    result.encodedUsername = encodedUsername();
    result.encodedPassword = encodedPassword();
    result.host = host;
    if ((port) == (com.squareup.okhttp.HttpUrl.defaultPort(scheme))) {
        result.port = -1;
    }else {
        result.port = port;
    }
    result.encodedPathSegments.clear();
    result.encodedPathSegments.addAll(encodedPathSegments());
    result.encodedQuery(encodedQuery());
    result.encodedFragment = encodedFragment();
    return result;
}