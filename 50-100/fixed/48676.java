@java.lang.Override
public de.cismet.cismap.commons.gui.piccolo.FeatureAnnotationSymbol getPointAnnotationSymbol() {
    if ((winkel) == null) {
        return new de.cismet.cismap.commons.gui.piccolo.FeatureAnnotationSymbol(de.cismet.cismap.commons.drophandler.builtin.MappingComponentGeoImageFileFeatureRenderer.ARROW_NULL);
    }else {
        final java.awt.image.BufferedImage rotatedArrow = de.cismet.tools.gui.ImageUtil.rotateImage(de.cismet.cismap.commons.drophandler.builtin.MappingComponentGeoImageFileFeatureRenderer.ARROW, (-(winkel)));
        final de.cismet.cismap.commons.gui.piccolo.FeatureAnnotationSymbol symb = new de.cismet.cismap.commons.gui.piccolo.FeatureAnnotationSymbol(rotatedArrow);
        symb.setSweetSpotX(0.5);
        symb.setSweetSpotY(0.5);
        return symb;
    }
}