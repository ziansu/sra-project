private org.json.JSONObject getJsonFromServiceResult(edu.hm.shareit.resources.BookServiceResult bookServiceResult) {
    final org.json.JSONObject returnJsonObject = new org.json.JSONObject();
    returnJsonObject.put("Status", bookServiceResult.getStatus().getStatusCode());
    returnJsonObject.put("Message", bookServiceResult.getMessage());
    return returnJsonObject;
}