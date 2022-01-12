@java.lang.Override
public void onCompleted(org.json.JSONObject jsonObject, com.facebook.GraphResponse response) {
    android.util.Log.d("friend123", jsonObject.toString());
    yolo.bachkhoa.com.smilealarm.Object.FriendObject friend = null;
    try {
        friend = new yolo.bachkhoa.com.smilealarm.Object.FriendObject(jsonObject.getString("name"), jsonObject.getString("id"), jsonObject.getString("email"));
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    myProfile = friend;
}