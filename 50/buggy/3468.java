@java.lang.Override
protected void onPause() {
    super.onPause();
    findViewById(de.aw.awlibrary.MainActivity.layoutDetailcontainer).setVisibility(View.GONE);
}