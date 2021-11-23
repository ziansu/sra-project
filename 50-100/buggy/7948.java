@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Integer... params) {
    int time = params[0];
    while (time > 0) {
        try {
            java.lang.Thread.sleep(1000);
        } catch (java.lang.InterruptedException e) {
        }
        time--;
        android.util.Log.d("asdf", (" " + time));
    } 
    publishProgress();
    return null;
}