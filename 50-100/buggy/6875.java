public void uploadPicture(com.pervasive.sth.network.Media mediaFile) throws java.lang.Exception {
    android.util.Log.d(LOG_TAG, "Uploading picture on web server.");
    org.json.JSONObject jsonPicture = new org.json.JSONObject();
    jsonPicture.put("PIC_NAME", mediaFile.getMediaName());
    org.json.JSONArray jArr = new org.json.JSONArray();
    byte[] pictureData = mediaFile.getData();
    java.lang.String encodedData = android.util.Base64.encodeToString(pictureData, Base64.DEFAULT);
    jsonPicture.put("PIC_DATA", encodedData);
    pictureClient.executePost(jsonPicture.toString());
}