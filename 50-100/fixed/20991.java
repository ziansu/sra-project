public java.util.ArrayList<com.pette.server.chattserver.chat.ChatMessage> getMessagesForUserAndUpdateIndex(java.lang.String user) {
    java.lang.Integer index = indexes.get(user);
    if (index != null) {
        java.util.ArrayList<com.pette.server.chattserver.chat.ChatMessage> subList = new java.util.ArrayList(messages.subList(index, ((messages.size()) - 1)));
        indexes.put(user, messages.size());
        return subList;
    }
    return null;
}