public void onDrawerClosed(android.view.View view) {
    super.onDrawerClosed(view);
    if (ut.getEmailAddress().equals("none")) {
        getSupportActionBar().setTitle("Your Position");
        android.util.Log.i("emfanisi", ut.getEmailAddress());
    }else {
        getSupportActionBar().setTitle(mActivityTitle);
        android.util.Log.i("emfanisi2", ut.getEmailAddress());
    }
    invalidateOptionsMenu();
}