@java.lang.Override
public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    lambda.viewcontroller.AudioManager.playSound("buttonClick");
    java.lang.System.exit(0);
}