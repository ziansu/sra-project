@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    for (java.lang.String name : fileNames) {
        java.io.File f = new java.io.File(getContext().getFilesDir(), name);
        f.delete();
    }
    mMainFramentComponentsLayout.setVisibility(View.GONE);
    mFetchMessageLayout.setVisibility(View.VISIBLE);
}