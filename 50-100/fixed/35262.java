@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    if (progressDialog.isShowing()) {
        progressDialog.dismiss();
    }
    intent.putExtra(com.example.leopeng.recyclerviewdemo.MainActivity.BOOKJSONKEY, s);
    username = editText.getText().toString();
    intent.putExtra(com.example.leopeng.recyclerviewdemo.MainActivity.USERNAMEKEY, username);
    if ((running) && (network)) {
        startActivity(intent);
    }
}