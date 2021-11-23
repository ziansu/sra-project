public void moveTowardsGoal() {
    float distance = edu.cornell.gdiac.downstream.models.Vector2.dst(lastGoal.x, lastGoal.y, goal.x, goal.y);
    edu.cornell.gdiac.downstream.models.Vector2 direction = goal.cpy().sub(this.getPosition()).nor();
    setY(((getY()) + ((direction.y) * 0.2F)));
    setX(((getX()) + ((direction.x) * 0.2F)));
}