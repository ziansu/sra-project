@java.lang.Override
public void mouseMoved(java.awt.event.MouseEvent e) {
    if (!((_shape) instanceof jmri.jmrit.display.controlPanelEditor.shape.PositionableRoundRect)) {
        throw new java.lang.IllegalArgumentException("parameter is not a PositionableRoundRect");
    }
    ((jmri.jmrit.display.controlPanelEditor.shape.PositionableRoundRect) (_shape)).setCornerRadius(java.lang.Integer.parseInt(_radiusText.getText()));
    updateShape();
}