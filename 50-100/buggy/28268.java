@java.lang.Override
protected void onPostExecute(java.lang.Boolean result) {
    android.util.Log.i(org.onelibrary.MainActivity.TAG, ("Auto login result: " + result));
    if (!result) {
        android.os.Looper.prepare();
        android.widget.Toast.makeText(getBaseContext(), "Failure to login.", Toast.LENGTH_LONG).show();
        android.content.Intent intent = new android.content.Intent(this, org.onelibrary.LoginActivity.class);
        startActivity(intent);
    }
}