public void spawn(java.awt.Point spawningPoint) {
    this.lastMove = null;
    this.direction = com.sun.javafx.scene.traversal.Direction.DOWN;
    stopAtTile(((int) (spawningPoint.getX())), ((int) (spawningPoint.getY())));
    setComingState(MovableState.SPAWN);
    this.health = edu.chalmers.vaporwave.util.Constants.DEFAULT_START_HEALTH;
}