@java.lang.Override
public void onScrollStateChanged(android.widget.AbsListView absListView, int i) {
    if ((i == (SCROLL_STATE_IDLE)) && (mShouldShowDownloadBtn)) {
        mBtnDownload.setVisibility(View.VISIBLE);
    }else
        if ((mBtnDownload.getVisibility()) != (android.view.View.INVISIBLE)) {
            mBtnDownload.setVisibility(View.INVISIBLE);
        }
    
}