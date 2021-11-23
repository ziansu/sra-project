public void pushConfiguration(java.lang.String[] servers, java.lang.String[] change) {
    for (int i = 0; i < (servers.length); i++) {
        pushConfiguration((((servers[i]) + ",") + change));
    }
}