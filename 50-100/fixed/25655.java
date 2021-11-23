private void createAccount(java.lang.String username, java.lang.String password) {
    synchronized(clients) {
        if ((!(username.equals(""))) && (!(password.equals("")))) {
            clients.put(username, password);
        }
    }
}