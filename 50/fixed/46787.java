@java.lang.Override
public <T> T parseAndClose(final java.io.InputStream in, final java.nio.charset.Charset charset, final java.lang.Class<T> dataClass) throws java.io.IOException {
    try {
        return com.joyent.manta.client.MantaObjectParser.MAPPER.readValue(in, dataClass);
    } finally {
        in.close();
    }
}