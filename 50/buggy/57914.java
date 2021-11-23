@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    try {
        penguinologist.diyandroidchallenge.Async.au.getUserProjects();
    } catch (java.lang.Exception e) {
        android.util.Log.e("error", e.toString());
    }
    return null;
}