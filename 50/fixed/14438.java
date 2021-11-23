@java.lang.Override
public void onPostExecute(java.lang.Boolean hasContent) {
    if (hasContent) {
        prepareContent();
    }else
        if ((mView) != null) {
            mView.resetSeekBar();
            mView.setClipPosition(0, mDuration.get());
        }
    
}