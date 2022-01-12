public boolean addConnection(com.chattapp.drafts.Controller.ConBag s) {
    runningConversations.remove(s.socket.getInetAddress().toString());
    return queuedConBags.offer(s);
}