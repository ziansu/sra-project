public static double crossProduct(org.sbml.jsbml.ext.layout.Point startPoint1, org.sbml.jsbml.ext.layout.Point startPoint2, org.sbml.jsbml.ext.layout.Point endPoint1, org.sbml.jsbml.ext.layout.Point endPoint2) {
    return (((endPoint1.x()) - (startPoint1.x())) * ((endPoint2.y()) - (startPoint2.y()))) - (((endPoint1.y()) - (startPoint1.y())) * ((endPoint2.x()) - (startPoint2.x())));
}