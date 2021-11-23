public void moveTowardTarget() {
    float dX = (com.mygdx.game.Mob.MOVE_SPEED) * ((float) (java.lang.Math.cos(((target.getxPos()) / (getXPos())))));
    float dY = (com.mygdx.game.Mob.MOVE_SPEED) * ((float) (java.lang.Math.sin(((target.getYPos()) / (getYPos())))));
    setPos(((getXPos()) + dX), ((getYPos()) + dY));
}