public final void hide() {
    if ((this.runtime) != null) {
        this.runtime.runOnPhysicsThread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                for (final com.thommil.libgdx.runtime.actor.physics.Collidable collidable : collidables) {
                    setCollidablesState(collidable, false);
                }
                hidden = true;
                onHide();
            }
        });
    }else {
        hidden = true;
        onHide();
    }
}