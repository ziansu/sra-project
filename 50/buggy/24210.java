private void circleMouseClicked(javafx.scene.input.MouseEvent e, org.Point p, javafx.scene.shape.Circle c) {
    if (!(mouseDragged)) {
        circleMouseClickNoDrag(e, p, c);
    }else {
        storeState();
        mapEdits.clearRedo();
    }
}