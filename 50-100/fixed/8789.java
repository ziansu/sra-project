@java.lang.Override
protected java.lang.String doInBackground(java.lang.Void... params) {
    com.myapp.handbook.HttpConnectionUtil util = new com.myapp.handbook.HttpConnectionUtil();
    java.lang.String url = (HttpConnectionUtil.URL_ENPOINT) + "/SendMessageToMultipleUser/";
    org.json.JSONObject messageJson = prepareMessage();
    com.myapp.handbook.HttpConnectionUtil.UploadImage(photoFile);
    while (!(HttpConnectionUtil.imageUploaded)) {
    } 
    try {
        if (HttpConnectionUtil.imageUploadStatus) {
            messageJson.put("ImageUrl", HttpConnectionUtil.imageUrl);
        }
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    return util.downloadUrl(url, HttpConnectionUtil.RESTMethod.PUT, messageJson);
}