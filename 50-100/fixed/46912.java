@java.lang.Override
@java.lang.SuppressWarnings(value = { "hiding" , "deprecation" })
public synchronized org.graalvm.polyglot.PolyglotContext createPolyglotContext(java.io.OutputStream out, java.io.OutputStream err, java.io.InputStream in, java.util.Map<java.lang.String, java.lang.String[]> arguments, java.util.Map<java.lang.String, java.lang.String> options) {
    checkState();
    com.oracle.truffle.api.vm.PolyglotContextImpl contextImpl = new com.oracle.truffle.api.vm.PolyglotContextImpl(this, out, err, in, null, options, arguments, getLanguages().keySet());
    addContext(contextImpl);
    return impl.getAPIAccess().newPolyglotContext(api, contextImpl);
}