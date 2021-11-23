public final void unbind() {
    for (final com.thommil.libgdx.runtime.actor.physics.Collidable collidable : collidables) {
        unbindCollidable(collidable);
    }
    this.runtime = null;
}