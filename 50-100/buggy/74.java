public static org.sbml.jsbml.ext.layout.Point createCenterPoint(org.sbml.jsbml.ext.layout.Point point1, org.sbml.jsbml.ext.layout.Point point2) {
    return new org.sbml.jsbml.ext.layout.Point((((point1.getX()) + (point2.getX())) / 2), (((point1.getY()) + (point2.getY())) / 2));
}