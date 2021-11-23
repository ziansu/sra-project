public void send(java.lang.String message) {
    synchronized(messages) {
        messages.add(message);
        java.lang.System.out.println(("Message added #messages=" + (messages.size())));
        messages.notify();
    }
}