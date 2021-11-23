@java.lang.Override
protected void onStop() {
    super.onStop();
    mImageProducer.stopImageFetch();
    if ((mGetImageAsyncTask) != null) {
        mGetImageAsyncTask.cancel(true);
    }
}