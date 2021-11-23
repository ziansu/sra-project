public void getConversationList(org.json.JSONArray data, org.apache.cordova.CallbackContext callback) {
    java.util.List<cn.jpush.im.android.api.model.Conversation> conversationList = cn.jpush.im.android.api.JMessageClient.getConversationList();
    if (conversationList != null) {
        java.lang.String json = mGson.toJson(conversationList);
        callback.success(json);
    }else {
        callback.error("Conversation list not find.");
    }
}