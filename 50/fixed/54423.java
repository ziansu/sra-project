private void notifyTextMessage(java.lang.String text) {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    com.blindcarboncopy.emotionalrobot.model.NodeRedMessage message = gson.fromJson(text, com.blindcarboncopy.emotionalrobot.model.NodeRedMessage.class);
    de.greenrobot.event.EventBus.getDefault().post(new com.blindcarboncopy.emotionalrobot.event.NodeRedMessageEvent(message));
}