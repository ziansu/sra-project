@java.lang.Override
public long contentLength() {
    return getContentLength(response.body());
}