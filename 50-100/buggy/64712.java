private void projectCMPIntoSupportPolygonIfOutsideLocal(us.ihmc.robotics.geometry.FrameConvexPolygon2d supportPolygon, us.ihmc.robotics.geometry.FramePoint2d desiredCMPToPack) {
    cmpProjected.set(false);
    if ((supportPolygon.getArea()) < 0.001) {
        supportPolygon.getCentroid(desiredCMPToPack);
        return ;
    }
    if (supportPolygon.isPointInside(desiredCMPToPack))
        return ;
    
    if (!(supportPolygon.isPointInside(projectedCMP))) {
        supportPolygon.getClosestVertex(projectedCMP, projectedCMP);
        cmpProjected.set(true);
    }
    desiredCMPToPack.setX(projectedCMP.getX());
}