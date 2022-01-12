@java.lang.Override
public java.lang.String get(com.squareup.okhttp.HttpUrl url) {
    java.lang.String query = url.query();
    return query.substring(1, ((query.length()) - 1));
}