@java.lang.Override
public void run() {
    org.json.JSONObject data = ((org.json.JSONObject) (args[0]));
    java.lang.String message;
    try {
        message = data.getString("message");
    } catch (org.json.JSONException e) {
        return ;
    }
    repository.addMessage(new com.homeservice.mickeycj.chatwithbot.model.Message(com.homeservice.mickeycj.chatwithbot.ChatFragment.IS_BOT, com.homeservice.mickeycj.chatwithbot.ChatFragment.BOT_NAME, message));
    updateChat();
}