@java.lang.Override
public void keyTyped(com.emergentorganization.cellrpg.tools.mapeditor.VisTextField textField, char c) {
    try {
        float v = java.lang.Float.parseFloat(textField.getText());
        com.emergentorganization.cellrpg.tools.mapeditor.MapTarget target = getMapTarget();
        target.movementComponent.setWorldPosition(target.movementComponent.getWorldPosition().x, v);
    } catch (java.lang.NumberFormatException e) {
    }
}