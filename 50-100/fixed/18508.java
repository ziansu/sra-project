@java.lang.Override
protected void onPostExecute(java.lang.Object params) {
    mView.setSwappedBitmap(mBitmap);
    mView.setFaces(mFaces);
    mView.invalidate();
    com.pierfrancescosoffritti.eyeswapper.EventBus.getInstance().post(new com.pierfrancescosoffritti.eyeswapper.ImageReadyEvent(((mFaces.size()) > 1 ? maxOffsetX : 0), ((mFaces.size()) > 1 ? maxOffsetY : 0), mFaces.size()));
}