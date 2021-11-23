@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if ((currStandInfoIndex) >= 0) {
        try {
            boolean tempValue = stand_auto_cross_baseline_Button.isChecked();
            currTeam.put(DBContract.TableStandInfo.COLNAME_STAND_AUTO_BASE_LINE, tempValue);
            if (!(fillingStandInfo)) {
                dbHelper.updateStandInfo(currTeam);
            }
        } catch (org.json.JSONException e) {
        }
    }
}