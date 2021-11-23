protected com.example.ayamanaka.instagramclient.InstagramUser getInstagramUserFromJSONObject(org.json.JSONObject userJSONObject) {
    try {
        com.example.ayamanaka.instagramclient.InstagramUser user = new com.example.ayamanaka.instagramclient.InstagramUser();
        user.id = userJSONObject.getString("id");
        user.username = userJSONObject.getString("username");
        user.fullName = userJSONObject.getString("full_name");
        user.profilePictureUrl = userJSONObject.getString("profile_picture");
        return user;
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    return null;
}