@java.lang.Override
public void dragStop(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y, int pointer) {
    if ((!(enabled)) || ((pathToFollow.size) < 2)) {
        return ;
    }
    ant.setSteeringBehavior(new com.badlogic.gdx.ai.steer.behaviors.FollowPath<com.badlogic.gdx.math.Vector2, com.badlogic.gdx.ai.steer.utils.paths.LinePath.LinePathParam>(ant, new com.badlogic.gdx.ai.steer.utils.paths.LinePath<com.badlogic.gdx.math.Vector2>(pathToFollow, true), 10).setArrivalTolerance(0).setDecelerationRadius(2));
    world.setActiveRecovery(true);
    enabled = false;
}