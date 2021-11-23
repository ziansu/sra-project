@java.lang.Override
public void onStop() {
    super.onStop();
    mRealm.close();
}