public void prepareMessages(final java.lang.String Chat, final java.lang.String Text, final java.lang.String Sender) {
    v6.caique.MyFirebaseMessagingService.IncomingMessages.put(Chat, Text);
    if (ChatActivity.Instances.containsKey(Chat)) {
        ChatActivity.Instances.get(Chat).runOnUiThread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                ChatActivity.Instances.get(Chat).DisplayMessage(Text, Sender);
            }
        });
    }
}