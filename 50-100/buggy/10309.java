private static hu.oe.nik.szfmv17t.environment.utils.Vector2d[] getCorners(hu.oe.nik.szfmv17t.environment.utils.Position collidableObjectPosition) {
    double rot = collidableObjectPosition.getAxisAngle();
    hu.oe.nik.szfmv17t.environment.utils.Vector2d center = collidableObjectPosition.getCenter();
    hu.oe.nik.szfmv17t.environment.utils.Vector2d[] worldCoords = hu.oe.nik.szfmv17t.environment.utils.CollisionDetector.generateWorldCoords(collidableObjectPosition);
    hu.oe.nik.szfmv17t.environment.utils.Vector2d[] corners = hu.oe.nik.szfmv17t.environment.utils.CollisionDetector.rotateWorldCoords(rot, center, worldCoords);
    return corners;
}