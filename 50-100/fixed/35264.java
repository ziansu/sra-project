protected void registerUI(com.aelitis.azureus.plugins.net.buddy.BuddyPluginBeta.ChatInstance chat) {
    synchronized(com.aelitis.azureus.plugins.net.buddy.swt.BuddyPluginView.pending_msg_map) {
        java.lang.Integer num = chat_uis.get(chat);
        if (num == null) {
            num = 1;
        }else {
            num++;
        }
        chat_uis.put(chat, num);
        if (num == 1) {
            updateIdleTT(false);
        }
    }
}