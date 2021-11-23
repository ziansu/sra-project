protected void detectCollisions() {
    brownshome.scriptwars.game.tanks.Shot other = world.getShot(position);
    if (other == (this)) {
        brownshome.scriptwars.game.tanks.Coordinates oldPosition = direction.opposite().move(position);
        brownshome.scriptwars.game.tanks.Shot swap = world.getShot(oldPosition);
        if ((swap != null) && ((swap.direction.opposite()) == (direction))) {
            isDead = true;
            swap.isDead = true;
            return ;
        }
        return ;
    }
    isDead = true;
    other.isDead = true;
}