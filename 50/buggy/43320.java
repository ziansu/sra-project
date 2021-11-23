private void nextActivity(java.lang.Class activity) {
    android.content.Intent intentActivity = new android.content.Intent(this, activity);
    startActivity(intentActivity);
}