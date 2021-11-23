public int getShape() {
    switch (wheelShape) {
        case "rect" :
            shape = bob.sun.bender.utils.AppConstants.ThemeShapeRect;
            break;
        case "oval" :
            shape = bob.sun.bender.utils.AppConstants.ThemeShapeOval;
            break;
        case "polygon" :
            shape = bob.sun.bender.utils.AppConstants.ThemeShapePolygon;
            break;
        default :
            shape = bob.sun.bender.utils.AppConstants.ThemeShapeOval;
            break;
    }
    return shape;
}