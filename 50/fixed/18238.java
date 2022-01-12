@java.lang.Override
public void write(int b) throws java.io.IOException {
    java.nio.ByteBuffer buffer = expandIfNeeded(1);
    buffer.put(((byte) (b)));
}