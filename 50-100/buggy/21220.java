@java.lang.Override
public void mouseMoved(java.awt.event.MouseEvent e) {
    if (!(ps instanceof jmri.jmrit.display.controlPanelEditor.shape.PositionablePolygon)) {
        throw new java.lang.IllegalArgumentException("parameter is not a PositionableRoundRect");
    }
    ((jmri.jmrit.display.controlPanelEditor.shape.PositionableRoundRect) (_shape)).setCornerRadius(java.lang.Integer.parseInt(_radiusText.getText()));
    updateShape();
}