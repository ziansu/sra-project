public static void updateChat(com.example.thomas.justchat.justchat.model.Message msg) {
    if (msg != null) {
        com.example.thomas.justchat.justchat.controller.ChatActivity.messageList.add((((((com.example.thomas.justchat.justchat.controller.ChatActivity.formatTime(java.util.Calendar.getInstance().getTimeInMillis())) + " - ") + (msg.getSender())) + ": ") + (msg.getBody())));
        com.example.thomas.justchat.justchat.controller.ChatActivity.adapter.notifyDataSetChanged();
    }
}