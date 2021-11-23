@java.lang.Override
public void handle(javafx.scene.input.MouseEvent event) {
    if (digitsim.DigitSimController.isLocked()) {
        return ;
    }
    Gestures.NodeGestures.draggedAnchorPoint = true;
    aP.setCoords(toolbox.GenFunctions.getXYAdaptGrid(new general.Vector2i(((int) (event.getX())), ((int) (event.getY())))));
    c.drawDirectPreLine();
}