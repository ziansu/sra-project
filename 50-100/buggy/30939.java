public void doDamage(float damage) {
    health -= damage;
    if (this.equals(gi.getPlayer1().getCastle().getWall())) {
        gi.setPlayerWallLabelChangeText(((int) (damage)));
    }else {
        gi.setComputerWallLabelChangeText(((int) (damage)));
    }
    if ((health) <= 0) {
        health = 0;
    }
}