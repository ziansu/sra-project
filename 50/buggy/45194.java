@java.lang.Override
public io.github.jason1114.library.ProxyMethod createProxyMethod(io.github.jason1114.library.ProxyContext<?> ctx, java.lang.reflect.Method method) {
    if (ctx instanceof io.github.jason1114.builtin.sharedpreference.SharedPreferenceProxyContext) {
        return new io.github.jason1114.builtin.sharedpreference.SharedPreferenceProxyMethod(method);
    }else {
        throw new java.lang.IllegalStateException("Proxy method not implemented.");
    }
}