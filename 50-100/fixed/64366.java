public void pushConfiguration(java.lang.String[] servers, java.lang.String[] change) {
    for (int i = 0; i < (servers.length); i++) {
        for (int j = 0; j < (change.length); j++) {
            pushConfiguration((((servers[i]) + ",") + (change[j])));
        }
    }
}