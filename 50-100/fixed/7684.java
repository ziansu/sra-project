@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (((currPitInfoIndex) >= 0) && ((currTeam) != null)) {
        try {
            boolean tempValue = pit_auto_high_goal_Button.isChecked();
            if ((currTeam.getBoolean(DBContract.TablePitInfo.COLNAME_PIT_AUTO_HIGH_GOAL)) != tempValue) {
                currTeam.put(DBContract.TablePitInfo.COLNAME_PIT_AUTO_HIGH_GOAL, tempValue);
                if (!(fillingPitInfo)) {
                    dbHelper.updatePitInfo(currTeam);
                }
            }
        } catch (org.json.JSONException e) {
        }
    }
}