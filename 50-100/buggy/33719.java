public boolean celluleValide() {
    if ((this.estBase()) != 0) {
        return false;
    }
    if (((this.uneCoord.getPositionX()) < (Plateau.grille.length)) && ((this.uneCoord.getPositionY()) < (plateau.Plateau.grille[0].length))) {
        return true;
    }
    return false;
}