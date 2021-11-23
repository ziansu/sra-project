@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    populateListView(result);
    dialog.dismiss();
    android.widget.Toast.makeText(this, "Items successfully parsed!", Toast.LENGTH_SHORT).show();
}