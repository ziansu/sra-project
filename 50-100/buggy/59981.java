@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((currStandInfoIndex) >= 0) {
        try {
            java.lang.String tempValue = stand_comments_Textbox.getText().toString();
            if ((currTeam.getString(DBContract.TableStandInfo.COLNAME_STAND_COMMENT)) != tempValue) {
                currTeam.put(DBContract.TableStandInfo.COLNAME_STAND_COMMENT, tempValue);
                if (!(fillingStandInfo)) {
                    dbHelper.updateStandInfo(currTeam);
                }
            }
        } catch (org.json.JSONException e) {
        }
    }else {
    }
}