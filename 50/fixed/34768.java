@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... params) {
    android.content.Intent intent = new android.content.Intent(this, com.dchen93.deliverysystem.HomeActivity.class);
    finish();
    this.startActivity(intent);
    return null;
}