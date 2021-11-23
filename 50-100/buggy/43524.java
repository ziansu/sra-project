public boolean executer() {
    boolean ok = false;
    this.partie.getPlateauJeu().getPlateau()[this.position.getX()][this.position.getY()] = null;
    this.joueur.getDeckPublic().getDeckPublic().add(indice, chef);
    return ok;
}