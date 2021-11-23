public void update(com.badlogic.gdx.math.Vector2 new_pos, com.sewm.defaultteam.WorldRenderer worldRenderer) {
    updateHealths(worldRenderer);
    player_.update(new_pos);
    updateEntities();
    cleanUp();
}