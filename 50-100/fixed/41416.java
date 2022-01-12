@java.lang.Override
public void checkClick(int button, boolean pressed) {
    if ((!(forceCameraControls)) || (!pressed)) {
        if (button == 0) {
            toolController.doEditToolActivatedPrimary(new com.jme3.math.Vector2f(mouseX, mouseY), pressed, cam);
        }
        if (button == 1) {
            toolController.doEditToolActivatedSecondary(new com.jme3.math.Vector2f(mouseX, mouseY), pressed, cam);
        }
    }
}