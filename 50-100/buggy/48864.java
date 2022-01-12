private void broadcast(java.lang.String messageAll, java.lang.String messageProvenance, int provenance) {
    for (int z = 0; z <= (joueurStart.size()); z++) {
        if (provenance == z)
            this.envoyer(messageProvenance, z);
        else
            this.envoyer(messageAll, z);
        
    }
}