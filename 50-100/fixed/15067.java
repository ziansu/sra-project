protected java.util.ArrayList<com.example.ayamanaka.instagramclient.InstagramComment> getInstagramCommentsFromJSONArray(org.json.JSONArray commentsJSONArray) {
    try {
        java.util.ArrayList<com.example.ayamanaka.instagramclient.InstagramComment> commentsArray = new java.util.ArrayList<>();
        for (int i = 0; i < (commentsJSONArray.length()); i++) {
            org.json.JSONObject commentJSONObject = commentsJSONArray.getJSONObject(i);
            com.example.ayamanaka.instagramclient.InstagramComment instagramComment = getInstagramCommentFromJSONObject(commentJSONObject);
            commentsArray.add(instagramComment);
        }
        return commentsArray;
    } catch (org.json.JSONException e) {
        e.printStackTrace();
        return null;
    }
}