@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((currPitInfoIndex) >= 0) {
        try {
            java.lang.String tempValue = pit_team_name_Textbox.getText().toString();
            if ((currTeam.getString(DBContract.TablePitInfo.COLNAME_PIT_TEAM_NAME)) != tempValue) {
                currTeam.put(DBContract.TablePitInfo.COLNAME_PIT_TEAM_NAME, tempValue);
                if (!(fillingPitInfo)) {
                    dbHelper.updatePitInfo(currTeam);
                }
            }
        } catch (org.json.JSONException e) {
        }
    }
}