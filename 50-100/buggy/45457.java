private void setCommentsCount() throws java.net.MalformedURLException {
    org.json.simple.JSONObject currentObject;
    int commentsCount = 0;
    for (int i = 0; i < ((recentMedia.size()) - 1); i++) {
        currentObject = ((org.json.simple.JSONObject) (recentMedia.get(i)));
        org.json.simple.JSONObject commentsArray = ((org.json.simple.JSONObject) (currentObject.get("comments")));
        commentsCount += java.lang.Integer.parseInt(commentsArray.get("count").toString());
    }
    this.commentsCount = commentsCount;
}