public <T extends nl.tudelft.model.Modifiable> void fire(T container, int locX, int locY, int width, int height) {
    if ((projectiles.size()) < (maxCount)) {
        nl.tudelft.model.Projectile proj = new nl.tudelft.model.Projectile(img, locX, locY, width, height, 6, this);
        container.toAdd(proj);
        projectiles.add(proj);
    }
}