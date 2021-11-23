@java.lang.Override
protected void onPostExecute(java.lang.Boolean isSomeOneJoined) {
    super.onPostExecute(isSomeOneJoined);
    if (isSomeOneJoined) {
        android.widget.Toast.makeText(this, "The others has joined", Toast.LENGTH_LONG).show();
    }else {
        android.widget.Toast.makeText(this, "No one has joined", Toast.LENGTH_LONG);
        buttonDisconnect.performClick();
    }
}