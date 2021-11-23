@java.lang.Override
protected java.lang.Void doInBackground(android.view.View... params) {
    try {
        penguinologist.diyandroidchallenge.Async.au.getUserProjects(params[0]);
    } catch (java.lang.Exception e) {
        android.util.Log.e("error", e.toString());
    }
    return null;
}