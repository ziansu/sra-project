@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    android.util.Log.i("called", "on destroy");
    dialog.dismiss();
}