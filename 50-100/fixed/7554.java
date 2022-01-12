@java.lang.Override
public void onClick(android.view.View v) {
    if (singleShot)
        mShotStateStore.storeShot();
    
    mShowCaseView.dismiss();
    mShowCaseView = null;
    info.run();
    if ((v.getId()) == (R.id.btn_end)) {
        showNext(singleShot);
    }else
        if ((v.getId()) == (R.id.btn_finalize)) {
            mShotStateStore.finished();
            mShowcaseInfos.clear();
        }
    
}