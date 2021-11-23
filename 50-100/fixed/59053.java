public void addOption(java.lang.String newOpt) {
    java.lang.String[] opt = new java.lang.String[(optionen.length) + 1];
    for (int i = 0; i < (optionen.length); i++) {
        opt[i] = optionen[i];
    }
    opt[optionen.length] = newOpt;
    optionen = opt;
}