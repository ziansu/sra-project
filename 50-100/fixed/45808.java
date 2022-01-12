@java.lang.Override
public void update(com.ne.revival_games.entity.WorldObjects.MyWorld world) {
    for (org.dyn4j.dynamics.Body body : this.shape.body.getInContactBodies(true)) {
        com.ne.revival_games.entity.WorldObjects.Entity.Entity entityInCollision = world.objectDatabase.get(body);
        if (entityInCollision.TYPE.opposite(this.TYPE)) {
            this.health -= entityInCollision.health;
            entityInCollision.health -= this.health;
            java.lang.System.out.println(("Collision in ENTITY.JAVA: " + (java.lang.System.currentTimeMillis())));
        }
    }
}