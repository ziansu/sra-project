@java.lang.Override
public void update(double dt) {
    timer = (timer) + dt;
    if ((timer) == 10) {
        getWorld().addObject(new Model.Physics.Entity.Mobs.Enemy(((int) (getX())), ((int) (getY())), enemy));
        timer = 0;
    }
}