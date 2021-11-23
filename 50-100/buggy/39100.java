public boolean parseDeleteTaskResponse(java.lang.String webResponse) {
    try {
        jObject = new org.json.JSONObject(webResponse);
        isError = jObject.getBoolean("isError");
        message = jObject.getString("Message");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    com.time_em.utils.Utils.showToast(context, message);
    return isError;
}