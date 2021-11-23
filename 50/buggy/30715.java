private void errHandlingWhenExceptions(org.json.JSONObject statusObj) {
    statusObj.put(Utils.JSON_ATTR_ITEM_STATUS, Utils.STATUS_ERROR);
    statusObj.put(Utils.JSON_ATTR_MESSAGE, "Failure in upload to Google Groups");
}