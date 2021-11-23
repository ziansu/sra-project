private void dispatchAckSend(org.json.JSONObject income) throws org.json.JSONException {
    org.json.JSONObject data = income.getJSONObject("data");
    if ((chatListener) != null) {
        ru.mail.park.chat.models.Message message = new ru.mail.park.chat.models.Message(data, getContext());
        chatListener.onAcknowledgeSendMessage(message);
    }
}