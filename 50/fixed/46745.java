public boolean isVertical(org.achartengine.renderer.DefaultRenderer renderer) {
    return (renderer instanceof org.achartengine.renderer.XYMultipleSeriesRenderer) && ((((org.achartengine.renderer.XYMultipleSeriesRenderer) (renderer)).getOrientation()) == (org.achartengine.renderer.XYMultipleSeriesRenderer.Orientation.VERTICAL));
}