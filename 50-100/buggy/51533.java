@java.lang.Override
public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    com.apptogo.roperace.manager.CustomActionManager.getInstance().registerAction(new com.apptogo.roperace.manager.CustomAction(0.01F, getScoreValue()) {
        @java.lang.Override
        public void perform() {
            if ((com.apptogo.roperace.manager.CustomActionManager.getInstance().getRegisteredActionCount()) == 0)
                setScoreValue(((getScoreValue()) + 1));
            
        }
    });
}