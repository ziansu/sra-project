@java.lang.Override
public void checkClick(int button, boolean pressed) {
    if (button == 0) {
        if ((isEditButtonEnabled()) && (!(forceCameraControls))) {
            toolController.doEditToolActivatedPrimary(new com.jme3.math.Vector2f(mouseX, mouseY), pressed, cam);
        }
    }
    if (button == 1) {
        if ((isEditButtonEnabled()) && (!(forceCameraControls))) {
            toolController.doEditToolActivatedSecondary(new com.jme3.math.Vector2f(mouseX, mouseY), pressed, cam);
        }
    }
}