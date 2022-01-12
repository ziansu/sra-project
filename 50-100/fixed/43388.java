public void sendMessageToAll(java.lang.String message) {
    gui.addMessage(message);
    synchronized(users) {
        for (User u : users) {
            if (((u.getName()) != null) && (!(u.getName().equals("")))) {
                u.sendMessage(message);
            }
        }
    }
}