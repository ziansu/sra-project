@java.lang.Override
public void resolveCollision(server.sim.PhysicsEntity other) {
    super.resolveCollision(other);
    if (other instanceof server.sim.Robot) {
        java.lang.System.out.println("Bullet-side collision");
        java.lang.System.out.println(other);
        server.sim.Robot rother = ((server.sim.Robot) (other));
        rother.setHealth(((rother.getHealth()) - (Constants.Bullet.DAMAGE)));
        markForRemoval();
    }else
        if (other instanceof server.sim.Bullet) {
            markForRemoval();
            other.markedForRemoval();
        }
    
}