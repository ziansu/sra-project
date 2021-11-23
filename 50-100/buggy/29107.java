public void init(int y, int spacing, resources.Direction facing) {
    int x = spacing;
    for (entities.Player m : members) {
        m.init(this, x, y, facing);
        x += spacing;
    }
    projectiles = new java.util.ArrayList<>();
    newProjectiles = new java.util.ArrayList<>();
    defeated = false;
}