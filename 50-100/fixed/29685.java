public java.lang.Boolean prepareMessages(final java.lang.String Chat, final java.lang.String Text, final java.lang.String Sender) {
    if (ChatActivity.Instances.containsKey(Chat)) {
        ChatActivity.Instances.get(Chat).runOnUiThread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                ChatActivity.Instances.get(Chat).DisplayMessage(Text, Sender);
            }
        });
        return true;
    }
    return false;
}