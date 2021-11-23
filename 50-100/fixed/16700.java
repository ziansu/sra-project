@java.lang.Override
public boolean fill(boolean block, java.nio.ByteBuffer data, int len) throws java.io.IOException {
    boolean result = fill(block, data.array(), ((data.arrayOffset()) + (data.position())), len);
    if (result) {
        data.position(((data.position()) + len));
    }
    return result;
}