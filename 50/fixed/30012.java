public cn.f_ms.frame.simple.util.http.Http.HttpHelper urlParams(java.lang.CharSequence key, java.lang.Object value, boolean isIgnoreValueNull) {
    if (isIgnoreValueNull) {
        cn.f_ms.frame.simple.util.CheckUtils.noNull(key);
        if (value == null) {
            return this;
        }
    }
    urlParams(key, value);
    return this;
}