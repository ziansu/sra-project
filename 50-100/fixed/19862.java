@butterknife.OnEditorAction(value = R.id.etCalPerDay)
public boolean setCalsPerDay() {
    calPerDay = etCalPerDay.getText().toString().trim();
    editor.putString(Constants.CALORIES_PER_DAY, calPerDay);
    editor.apply();
    tvLeftCals.setText(calDiff());
    return false;
}