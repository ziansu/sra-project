private void broadcast(java.lang.String message) {
    for (int z = 0; z < (joueurStart.size()); z++) {
        this.envoyer(message, z);
    }
}