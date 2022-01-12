@java.lang.Override
public void handle(javafx.scene.input.MouseEvent event) {
    if (!(attacking)) {
        coverPane.setVisible(false);
        moveEllipse.setVisible(false);
        attackEllipse.setVisible(false);
        if ((currentUnit) != null) {
            currentUnit.getTransforms().remove(direction);
        }
    }
}