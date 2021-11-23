@java.lang.Override
protected void onResume() {
    super.onResume();
    if (args.getBoolean(de.aw.awlibrary.MainActivity.DETAILCONTAINERVISIBILITY)) {
        android.view.View detailContainer = findViewById(de.aw.awlibrary.MainActivity.layoutDetailcontainer);
        if (detailContainer != null) {
            detailContainer.setVisibility(View.VISIBLE);
        }
    }
}