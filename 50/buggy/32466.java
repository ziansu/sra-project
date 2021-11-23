public static java.awt.Point moveCat1Move(java.awt.Point cat, java.awt.Point mouse) {
    double angle = CatAndMouse.angleTwoPoints(cat, mouse);
    CatAndMouse.Direction catDirection = CatAndMouse.convertAngleToDirection(angle);
    cat = CatAndMouse.translatePointWithDirection(cat, catDirection);
    return cat;
}