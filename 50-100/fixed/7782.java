public void primaryTask() {
    before.addAction(com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(com.badlogic.gdx.scenes.scene2d.actions.Actions.fadeOut(((duration) / 2)), com.badlogic.gdx.scenes.scene2d.actions.Actions.run(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            secondaryTask();
        }
    })));
}