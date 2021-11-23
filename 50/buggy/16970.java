@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    com.example.marinex.gittrendapp.HttpHandler sh = new com.example.marinex.gittrendapp.HttpHandler();
    jsonStr = sh.makeServiceCall(url);
    android.util.Log.e(TAG, ("Response from url: " + (jsonStr)));
    return null;
}