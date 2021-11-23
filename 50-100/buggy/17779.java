@java.lang.Override
protected void updateCanvas() {
    canvas.getContext2d().clearRect(0, 0, org.geogebra.web.web.gui.util.CANVAS_SIZE, org.geogebra.web.web.gui.util.CANVAS_SIZE);
    double[] coords = new double[]{ (app.getActiveEuclidianView().getXmin()) + (org.geogebra.web.web.gui.util.MOWPointStyleButton.RW_MARGIN) , (app.getActiveEuclidianView().getYmax()) - (org.geogebra.web.web.gui.util.MOWPointStyleButton.RW_MARGIN) };
    updateGeo();
    drawPoint.update(coords);
    drawPoint.draw(g2);
}