@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    draw(mCanvas);
    mListener.onDrawCreated(mBitmap);
}