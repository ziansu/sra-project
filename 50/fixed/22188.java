@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    draw(mCanvas);
    if ((mListener) != null) {
        mListener.onDrawCreated(mBitmap);
    }
}