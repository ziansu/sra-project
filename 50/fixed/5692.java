public void addJSONPostParam(org.json.JSONObject jsonObject) {
    com.squareup.okhttp.MediaType mediaType = com.squareup.okhttp.MediaType.parse("application/json; charset=utf-8");
    requestBody = com.squareup.okhttp.RequestBody.create(mediaType, jsonObject.toString());
}