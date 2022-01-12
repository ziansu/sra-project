@java.lang.Override
public void handleResult(java.lang.String data) {
    try {
        org.json.JSONObject result = new org.json.JSONObject(data);
        newProfile.setFriends(new cwa115.trongame.FriendList(result.getString("friends"), true));
        cwa115.trongame.Profile dataToUpdate = cwa115.trongame.Profile.GetUpdatedData(localProfile, newProfile);
        pushUpdatedDataToServer(localProfile, dataToUpdate);
    } catch (org.json.JSONException e) {
        showToast(R.string.update_failed);
    }
}