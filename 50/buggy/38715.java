@java.lang.Override
protected void onPostExecute(java.util.List<java.lang.String> cities) {
    if (cities == null) {
        android.widget.Toast.makeText(getApplicationContext(), R.string.citiesnull, Toast.LENGTH_LONG).show();
    }
}