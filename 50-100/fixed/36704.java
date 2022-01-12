protected void onPostExecute(java.lang.String file_url) {
    pDialog.dismiss();
    if (file_url != null) {
        android.content.Intent i = new android.content.Intent(this, com.jaytseng.urbanrace.sfuurbanrace.Main.class);
        startActivity(i);
        android.widget.Toast.makeText(this, file_url, Toast.LENGTH_LONG).show();
    }
}