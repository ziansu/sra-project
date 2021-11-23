@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    if (s != null) {
        ((android.widget.EditText) (findViewById(R.id.titletext))).setText(s);
    }else {
        d.dismiss();
        new com.afollestad.materialdialogs.AlertDialogWrapper.Builder(this).setTitle("Title not found").setPositiveButton(R.string.btn_ok, null).show();
    }
}