@java.lang.Override
public void stream(org.i3xx.util.client.io.Resource resource, java.io.InputStream in) throws java.io.IOException {
    final java.lang.String r = resource.readToString(in, java.nio.charset.Charset.defaultCharset().toString());
    resource.result = new org.i3xx.util.client.io.ResultImpl(retCode) {
        @java.lang.Override
        public java.lang.Object getResult() {
            return r;
        }
    };
}