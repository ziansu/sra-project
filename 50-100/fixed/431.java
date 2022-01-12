public static org.geotools.styling.Style showDialog(org.eclipse.swt.widgets.Shell parent, org.geotools.map.Layer layer) throws java.io.IOException {
    if (!(org.geotools.swt.utils.Utils.isGridLayer(layer))) {
        org.geotools.data.simple.SimpleFeatureSource featureSource = ((org.geotools.data.simple.SimpleFeatureSource) (layer.getFeatureSource()));
        org.geotools.styling.Style style = layer.getStyle();
        return org.geotools.swt.styling.SimpleStyleConfigurator.showDialog(parent, featureSource, style);
    }
    return null;
}