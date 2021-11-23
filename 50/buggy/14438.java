@java.lang.Override
public void onPostExecute(java.lang.Boolean hasContent) {
    if (hasContent) {
        prepareContent();
    }else {
        mView.resetSeekBar();
        mView.setClipPosition(0, mDuration.get());
    }
}