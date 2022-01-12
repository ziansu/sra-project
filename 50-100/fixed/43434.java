protected com.example.ayamanaka.instagramclient.InstagramComment getInstagramCommentFromJSONObject(org.json.JSONObject jsonObject) {
    try {
        com.example.ayamanaka.instagramclient.InstagramComment comment = new com.example.ayamanaka.instagramclient.InstagramComment();
        comment.user = getInstagramUserFromJSONObject(jsonObject.getJSONObject("from"));
        comment.text = jsonObject.getString("text");
        comment.createdTime = jsonObject.getString("created_time");
        return comment;
    } catch (org.json.JSONException e) {
        e.printStackTrace();
        return null;
    }
}