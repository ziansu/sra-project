@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    super.onPostExecute(result);
    dlg.dismiss();
    if (result.contains("true")) {
        updateUISchool_Listing(result);
    }else
        if (result.contains("false")) {
            android.widget.Toast.makeText(getApplicationContext(), "Wrong User", Toast.LENGTH_SHORT).show();
        }
    
}