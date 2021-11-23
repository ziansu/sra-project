public void reachedEnd() {
    PlayScreen.spawnableCreeps.remove(this);
    world.destroyBody(b2Body);
}