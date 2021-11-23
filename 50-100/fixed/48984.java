public void moveTowardsGoal() {
    edu.cornell.gdiac.downstream.models.Vector2 direction = goal.cpy().sub(this.getPosition()).nor();
    setY(((getY()) + ((direction.y) * 0.2F)));
    setX(((getX()) + ((direction.x) * 0.2F)));
}