@java.lang.Override
public void mouseMove(org.eclipse.swt.events.MouseEvent event) {
    xPositionText.setText(((event.x) + ""));
    yPositionText.setText(((event.y) + ""));
    org.codetome.hexameter.core.backport.Optional<org.codetome.hexameter.core.api.Hexagon> currMouseOverOptional = hexagonalGrid.getByPixelCoordinate(event.x, event.y);
    if (currMouseOverOptional.isPresent()) {
        currMouseOver = currMouseOverOptional.get();
        canvas.redraw();
    }
}