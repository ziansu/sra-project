public static geogebra.common.awt.Shape getGawtShape(geogebra.common.awt.Shape shape) {
    geogebra.common.awt.Shape shapeCommon = (shape instanceof geogebra.common.euclidian.GeneralPathClipped) ? ((geogebra.common.euclidian.GeneralPathClipped) (shape)).getGeneralPath() : shape;
    if (!(shapeCommon instanceof geogebra.common.awt.geogebra.web.awt.Shape)) {
        return null;
    }
    return ((geogebra.common.awt.geogebra.web.awt.Shape) (shapeCommon)).getGawtShape();
}