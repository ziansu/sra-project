public void primaryTask() {
    after.addAction(com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(1));
    before.addAction(com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(0), com.badlogic.gdx.scenes.scene2d.actions.Actions.fadeOut(((this.duration) / 2)), com.badlogic.gdx.scenes.scene2d.actions.Actions.run(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            secondaryTask();
        }
    })));
}