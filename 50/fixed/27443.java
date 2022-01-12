@java.lang.Override
public com.koushikdutta.ion.future.ResponseFuture<java.lang.String> asString(java.nio.charset.Charset charset) {
    return execute(new com.koushikdutta.async.parser.StringParser(charset));
}