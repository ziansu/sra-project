@java.lang.Override
protected void onPostExecute(java.lang.Boolean result) {
    android.content.Intent intent = new android.content.Intent();
    intent.setAction(Intent.ACTION_VIEW);
    intent.setClass(this, stammgoodapps.cats.LoadingScreen.class);
    intent.putExtra("class", "stammgoodapps.cats.ListViewLoader");
    intent.putExtra("allContacts", false);
    intent.putExtra("selecting", false);
    this.startActivity(intent);
}