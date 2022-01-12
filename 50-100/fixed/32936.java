public void secondaryTask() {
    after.addAction(com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(com.badlogic.gdx.scenes.scene2d.actions.Actions.fadeIn(((duration) / 2)), com.badlogic.gdx.scenes.scene2d.actions.Actions.run(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            isFinished = true;
            parent.finishedTransition();
        }
    })));
}