protected void unregisterUI(com.aelitis.azureus.plugins.net.buddy.BuddyPluginBeta.ChatInstance chat) {
    synchronized(com.aelitis.azureus.plugins.net.buddy.swt.BuddyPluginView.pending_msg_map) {
        java.lang.Integer num = chat_uis.get(chat);
        if (num == null) {
        }else {
            num--;
        }
        if (num == 0) {
            chat_uis.remove(chat);
            updateIdleTT(false);
        }else {
            chat_uis.put(chat, num);
        }
    }
}