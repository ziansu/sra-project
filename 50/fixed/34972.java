public void finishWriteData() {
    if ((mFileOutputStream) != null) {
        try {
            mFileOutputStream.close();
            mFileOutputStream = null;
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}