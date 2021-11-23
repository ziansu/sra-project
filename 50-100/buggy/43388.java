public void sendMessageToAll(java.lang.String message) {
    synchronized(users) {
        for (User u : users) {
            if (((u.getName()) != null) && (!(u.getName().equals("")))) {
                u.sendMessage(message);
            }
        }
    }
    gui.addMessage(message);
}