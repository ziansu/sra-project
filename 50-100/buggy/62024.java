public void readExternal(java.io.ObjectInput in) throws java.io.IOException, java.lang.ClassNotFoundException {
    in.read(length, 0, 4);
    type = ((byte) (in.read()));
    int messageLength = java.nio.ByteBuffer.wrap(length).getInt();
    payload = new byte[messageLength - 1];
    in.read(payload, 0, messageLength);
}