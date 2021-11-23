@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    try {
        cursor = dbManager.getAllBusinesses();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}