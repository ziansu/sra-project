@java.lang.Override
protected void onStart() {
    spiceManager.start(this);
    super.onStart();
    android.util.Log.v("MainActiviry.onStart", "Execute repositoriesPreviews");
}