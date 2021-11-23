public boolean celluleValide() {
    if (((this.uneCoord.getPositionX()) < (Plateau.grille.length)) && ((this.uneCoord.getPositionY()) < (Plateau.grille[0].length))) {
        return true;
    }
    return false;
}