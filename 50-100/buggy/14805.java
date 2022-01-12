@java.lang.Override
public void onClick(android.view.View v) {
    if ((v.getId()) == (R.id.settings_button_validate)) {
        android.widget.EditText editText = ((android.widget.EditText) (findViewById(R.id.settings_Ball_Speed)));
        int ball_speed = java.lang.Integer.valueOf(editText.getText().toString());
        android.content.SharedPreferences sharedPreferences_ball_speed = android.preference.PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        android.content.SharedPreferences.Editor editor = sharedPreferences_ball_speed.edit();
        editor.putInt("ball_speed", ball_speed);
        editor.commit();
        this.finish();
    }
}