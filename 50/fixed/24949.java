@java.lang.Override
protected void onPostResume() {
    super.onPostResume();
    if (mRecreateActivity) {
        mRecreateActivity = false;
        recreate();
    }
}