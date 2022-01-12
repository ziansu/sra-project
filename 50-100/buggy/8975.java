private short[] getUpdateContent(java.io.BufferedInputStream in, int size) throws java.io.IOException {
    short[] actions = new short[size];
    for (int i = 0; i < size; i++) {
        actions[i] += (in.read()) << 8;
        actions[i] += in.read();
    }
    return actions;
}