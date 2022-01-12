public com.squareup.okhttp.HttpUrl.Builder newBuilder() {
    com.squareup.okhttp.HttpUrl.Builder result = new com.squareup.okhttp.HttpUrl.Builder();
    result.scheme = scheme;
    result.encodedUsername = encodedUsername();
    result.encodedPassword = encodedPassword();
    result.host = host;
    result.port = ((port) != (com.squareup.okhttp.HttpUrl.defaultPort(scheme))) ? port : -1;
    result.encodedPathSegments.clear();
    result.encodedPathSegments.addAll(encodedPathSegments());
    result.encodedQuery(encodedQuery());
    result.encodedFragment = encodedFragment();
    return result;
}