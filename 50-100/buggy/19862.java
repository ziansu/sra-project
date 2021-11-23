@butterknife.OnEditorAction(value = R.id.etCalPerDay)
public boolean setCalsPerDay() {
    calPerDay = etCalPerDay.getText().toString().trim();
    editor.putString(Constants.CALORIES_PER_DAY, calPerDay);
    editor.apply();
    android.util.Log.d("check", sPreferences.getString(Constants.CALORIES_PER_DAY, "0"));
    tvLeftCals.setText(calDiff());
    return false;
}