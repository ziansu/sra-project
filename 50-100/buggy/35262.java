@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    if (progressDialog.isShowing()) {
        progressDialog.dismiss();
    }
    android.content.Intent intent = new android.content.Intent(this, com.example.leopeng.recyclerviewdemo.RecyclerViewActivity.class);
    intent.putExtra(com.example.leopeng.recyclerviewdemo.MainActivity.BOOKJSONKEY, s);
    username = editText.getText().toString();
    intent.putExtra(com.example.leopeng.recyclerviewdemo.MainActivity.USERNAMEKEY, username);
    if ((running) && (network)) {
        startActivity(intent);
    }
}