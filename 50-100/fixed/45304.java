@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    for (java.lang.String name : fileNames) {
        java.io.File f = new java.io.File(getContext().getFilesDir(), name);
        f.delete();
        mFetchMessageLayout.setVisibility(View.VISIBLE);
        mMainFramentComponentsLayout.setVisibility(View.GONE);
    }
}