private void deleteMessage(java.lang.String uuidString) {
    io.khe.kenthackenough.backend.Message toDelete = io.khe.kenthackenough.backend.Message.getByID(uuidString);
    if (toDelete != null) {
        toDelete.closeNotification(applicationContext);
    }
    messages.remove(toDelete);
    for (io.khe.kenthackenough.backend.LiveFeedManager.DeletedMessageListener listener : deletedMessageListeners) {
        listener.messageDeleted(toDelete, messages);
    }
}