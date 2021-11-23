public void hide() {
    addAction(com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(com.badlogic.gdx.scenes.scene2d.actions.Actions.moveTo(0, Gdx.graphics.getHeight(), 0.33F, Interpolation.exp5Out), com.badlogic.gdx.scenes.scene2d.actions.Actions.run(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            remove();
        }
    })));
}