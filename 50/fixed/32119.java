private void addUser(Server.ClientThread thread) {
    clientList.put(thread.user, thread);
    if (hasObserver)
        java.lang.System.out.println(("Client added: " + (thread.user.getName())));
    
}