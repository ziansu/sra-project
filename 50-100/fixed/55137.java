@java.lang.Override
public void onPost(by.superteam.loliboo.ProcessingStatus processStatus, java.lang.String s) {
    try {
        board = new org.json.JSONObject(s);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    try {
        name.setText(board.get("Name").toString());
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}