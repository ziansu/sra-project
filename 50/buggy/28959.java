public com.xiaoleilu.hutool.http.HttpRequest body(byte[] content, java.lang.String contentType) {
    return body(com.xiaoleilu.hutool.util.StrUtil.str(content, charset));
}