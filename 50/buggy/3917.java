public final void unbind() {
    this.runtime.runOnPhysicsThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            for (final com.thommil.libgdx.runtime.actor.physics.Collidable collidable : collidables) {
                unbindCollidable(collidable);
            }
        }
    });
    this.runtime = null;
}