@java.lang.Override
protected void onPause() {
    super.onPause();
    sharedPreferences = this.getPreferences(Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.putString("btn_name", button_tracking.getText().toString());
    editor.putBoolean("isTracking", isTracking);
    editor.commit();
}