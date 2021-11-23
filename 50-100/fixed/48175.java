public void fire(int locX, int locY, int width) {
    if (projectiles.isEmpty()) {
        projectiles.add(new nl.tudelft.model.Projectile(img, locX, locY, width, 6, this));
        obj.add(projectiles.get(0));
        projectiles.get(0).fire();
    }
}