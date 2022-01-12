@java.lang.Override
public void onResume() {
    super.onResume();
    hideSubtitle();
    activityMain.getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    if ((app) != null) {
        app.setNotEditing();
    }
    checkHeatmapsExist();
}