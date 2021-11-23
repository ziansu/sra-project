@java.lang.Override
public int write(java.nio.ByteBuffer src) throws java.io.IOException {
    final int position = src.position();
    channel1.write(src);
    src.position(position);
    return channel2.write(src);
}