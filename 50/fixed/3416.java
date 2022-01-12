@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    prepareData();
    initAppDataIfNeed();
    startService();
    return null;
}