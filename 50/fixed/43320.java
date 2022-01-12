private void nextActivity(java.lang.Class activity) {
    if (activity != null) {
        android.content.Intent intentActivity = new android.content.Intent(this, activity);
        startActivity(intentActivity);
    }
}