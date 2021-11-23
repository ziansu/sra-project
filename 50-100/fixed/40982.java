public boolean representationOkay() {
    if (!(isOkay())) {
        return false;
    }
    if ((this.team) != (this.piece.getTeam())) {
        return false;
    }
    if ((this.isAttack) && ((this.team) == (this.enemy.getTeam()))) {
        return false;
    }
    return true;
}