@java.lang.Override
public de.cismet.cismap.commons.gui.piccolo.FeatureAnnotationSymbol getPointAnnotationSymbol() {
    final de.cismet.cismap.commons.gui.piccolo.FeatureAnnotationSymbol symb;
    if ((winkel) == null) {
        symb = new de.cismet.cismap.commons.gui.piccolo.FeatureAnnotationSymbol(de.cismet.cismap.commons.drophandler.builtin.MappingComponentGeoImageFileFeatureRenderer.ARROW_NULL);
    }else {
        symb = new de.cismet.cismap.commons.gui.piccolo.FeatureAnnotationSymbol(de.cismet.tools.gui.ImageUtil.rotateImage(de.cismet.cismap.commons.drophandler.builtin.MappingComponentGeoImageFileFeatureRenderer.ARROW, (-(winkel))));
    }
    symb.setSweetSpotX(0.5);
    symb.setSweetSpotY(0.5);
    return symb;
}