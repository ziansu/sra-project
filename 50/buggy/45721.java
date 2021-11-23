private void fail() {
    mWriter.flush();
    mWriter.close();
    mListener.onFail();
}