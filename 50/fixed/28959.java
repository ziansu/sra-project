public com.xiaoleilu.hutool.http.HttpRequest body(byte[] content) {
    return body(com.xiaoleilu.hutool.util.StrUtil.str(content, charset));
}