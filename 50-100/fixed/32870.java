private void launchMissile() {
    if ((this.timeStart) >= (timeEnd)) {
        java.awt.Point start = getMissileStartingPosition();
        com.mygdx.tanks.Missile missile = new com.mygdx.tanks.Missile(tank, tank.getDirection());
        missile.x = start.x;
        missile.y = start.y;
        board.missilesList.add(missile);
        timeEnd = (this.date.getTime()) + (this.reloadTime);
    }
}