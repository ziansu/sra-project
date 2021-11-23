@java.lang.Override
public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    java.lang.System.out.println("Clickeed");
    if (!(switchbool)) {
        switchbool = true;
    }else
        switchbool = false;
    
    super.clicked(event, x, y);
}