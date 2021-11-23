@java.lang.Override
public int write(java.nio.ByteBuffer src) throws java.io.IOException {
    channel1.write(src);
    return channel2.write(src);
}