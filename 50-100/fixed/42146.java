@java.lang.Override
@java.lang.SuppressWarnings(value = "all")
public void dispose() {
    this.paused = true;
    for (final com.thommil.libgdx.runtime.scene.Layer layer : this.layers) {
        layer.dispose();
    }
    for (final com.thommil.libgdx.runtime.scene.Actor actor : this.actorsMap.values()) {
        actor.dispose();
    }
    this.executor.shutdown();
    this.physicsWorld.dispose();
}