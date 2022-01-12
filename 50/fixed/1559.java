private org.json.JSONObject errorHandlingWhenNot200(org.json.JSONObject statusObj, int statusCode, java.lang.String errMsg) {
    statusObj.put(Utils.JSON_ATTR_ITEM_STATUS, Utils.STATUS_ERROR);
    statusObj.put(Utils.JSON_ATTR_MESSAGE, ((errMsg + " ") + statusCode));
    return statusObj;
}