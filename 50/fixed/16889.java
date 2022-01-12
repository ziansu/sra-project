@butterknife.OnClick(value = R.id.swtPlanAlarm)
public void toggleAlarm() {
    new fr.nawrasg.atlantis.async.DataPUT(mContext).execute(App.HOME, ("alarm=" + (swtAlarm.isChecked())));
}