@java.lang.Override
public void show() {
    world_ = new com.sewm.defaultteam.World();
    worldRenderer_ = new com.sewm.defaultteam.WorldRenderer(world_, false);
    worldController_ = new com.sewm.defaultteam.WorldController(world_);
    com.sewm.defaultteam.GameScreen.is_touched = false;
}