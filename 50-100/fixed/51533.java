@java.lang.Override
public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    if ((com.apptogo.roperace.manager.CustomActionManager.getInstance().getRegisteredActionCount()) == 0) {
        com.apptogo.roperace.manager.CustomActionManager.getInstance().registerAction(new com.apptogo.roperace.manager.CustomAction(0.01F, getScoreValue()) {
            @java.lang.Override
            public void perform() {
                setScoreValue(((getScoreValue()) + 1));
            }
        });
    }
}