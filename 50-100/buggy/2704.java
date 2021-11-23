public void zoomToExactFit() {
    if (!(this.isTranformInProgress())) {
        prefuse.Visualization vis = this.getVisualization();
        java.awt.geom.Rectangle2D bounds = vis.getBounds(Visualization.ALL_ITEMS);
        prefuse.util.GraphicsLib.expand(bounds, ((int) (1 / (this.getScale()))));
        prefuse.util.display.DisplayLib.fitViewToBounds(this, bounds, 0);
    }
}