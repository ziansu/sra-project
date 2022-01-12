@java.lang.Override
protected void getData(byte[] buffer) throws java.io.IOException {
    if ((mInputData) != null) {
        mInputData.readFully(buffer);
    }
}