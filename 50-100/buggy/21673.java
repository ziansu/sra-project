public void update(long dt) {
    timer = (timer) + dt;
    if ((timer) == 10) {
        getWorld().addObject(new Model.Physics.Entity.Mobs.Enemy(((int) (getX())), ((int) (getY())), enemy));
        timer = 0;
    }
}