@butterknife.OnClick(value = R.id.setButton)
public void setTone() {
    com.justinmutsito.whizzer.wizzerclock.preferences.Preferences preferences = new com.justinmutsito.whizzer.wizzerclock.preferences.Preferences(this);
    if ((mWhichTone) == 0) {
        preferences.saveAlarmTone(checkedRB());
    }else {
        preferences.saveTimerTone(checkedRB());
    }
    stop();
    finish();
}