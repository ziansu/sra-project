public void shootBullet() {
    game.Game.getInstance().getLevel().getBullets().add(new entity.Bullet(new entity.Coordinate(((getX()) + ((getWidth()) / 2)), ((getY()) + ((getHeight()) / 2))), Direction.SOUTH, this));
}