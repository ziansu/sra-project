private managers.roadnetwork.RUnit checkIntersectionAndReturnIntersectedRUnit(java.util.Collection<managers.roadnetwork.RUnit> rUnits, ui.Coordinates intersectionCoordinates) {
    for (managers.roadnetwork.RUnit rUnit : rUnits) {
        if (((rUnit.getX()) == (intersectionCoordinates.getX())) & ((rUnit.getY()) == (intersectionCoordinates.getY()))) {
            return rUnit;
        }
    }
    return null;
}