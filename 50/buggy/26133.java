@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    mUserRef.removeEventListener(mCurrentUserRefListener);
}