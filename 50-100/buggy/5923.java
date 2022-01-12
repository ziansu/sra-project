public void update() {
    for (com.ne.revival_games.entity.WorldObjects.Entity.Entity entity : this.team.getTeamObjects()) {
        entity.update(world);
    }
    if (holdingGhost) {
        org.dyn4j.geometry.Vector2 delta = new org.dyn4j.geometry.Vector2(((pullTowards.x) - (ghost.entity.shape.getX())), ((pullTowards.y) - (ghost.entity.shape.getY())));
        ghost.setLinearVelocity((10 * (delta.x)), (10 * (delta.y)));
    }
}