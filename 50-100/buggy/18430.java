@java.lang.Override
public void read(org.apache.flink.core.memory.DataInputView in) throws java.io.IOException {
    final int length = in.readInt();
    byte[] buffer = this.path;
    if ((buffer == null) || ((buffer.length) < length)) {
        buffer = new byte[length];
        this.path = buffer;
    }
    in.readFully(buffer);
}