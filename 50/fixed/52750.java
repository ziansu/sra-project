private boolean addPseudoUser(java.lang.String pseudo) {
    if (!(this.listePseudo.contains(pseudo))) {
        this.listePseudo.add(pseudo);
        return true;
    }
    return false;
}