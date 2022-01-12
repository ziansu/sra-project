protected void onPostExecute(java.lang.String file_url) {
    pDialog.dismiss();
    if (file_url != null) {
        android.widget.Toast.makeText(this, file_url, Toast.LENGTH_LONG).show();
    }
    android.content.Intent i = new android.content.Intent(this, com.jaytseng.urbanrace.sfuurbanrace.Main.class);
    finish();
    startActivity(i);
}