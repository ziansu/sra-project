private void saveRecord() {
    android.util.Log.d(com.han.will.pushup.view.PushUpFragment.TAG, ("saveRecord: mTimes = " + (mTimes)));
    if ((mTimes) > 0) {
        mPushUpPresenter.saveRecord(mUid, mName, mTimes);
    }
}