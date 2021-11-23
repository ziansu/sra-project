public boolean executer() {
    boolean ok = true;
    this.partie.getPlateauJeu().getPlateau()[this.position.getX()][this.position.getY()] = null;
    this.joueur.getDeckPublic().getDeckPublic().add(chef);
    return ok;
}