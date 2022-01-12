public void init(int y, int spacing, int facing) {
    int x = spacing;
    for (entities.Player m : members) {
        m.init(this, x, y, new resources.Direction(facing));
        x += spacing;
    }
    projectiles = new java.util.ArrayList<>();
    newProjectiles = new java.util.ArrayList<>();
    defeated = false;
}