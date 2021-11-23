public void sendMessage(bus.Message m) {
    for (int i = 0; i < (registeredListeners.size()); i++) {
        registeredListeners.get(i).receiveMessage(m);
    }
}