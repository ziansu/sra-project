public void addMessage(java.lang.String key, long notificationId) {
    if ((this.messages) == null) {
        synchronized(this) {
            if ((this.messages) == null) {
                this.messages = new com.ctrip.framework.apollo.core.dto.ApolloNotificationMessages();
            }
        }
        this.messages.put(key, notificationId);
    }
}