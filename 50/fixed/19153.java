@java.lang.Override
public byte[] getContent() {
    return (request.getEntity()) != null ? request.getEntity().toString().getBytes(java.nio.charset.Charset.forName("UTF-8")) : null;
}