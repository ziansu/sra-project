private managers.roadnetwork.RUnit checkIntersectionAndReturnIntersectedRUnit(java.util.Collection<managers.roadnetwork.RUnit> rUnits, ui.Coordinates intersectionCoordinates) {
    for (managers.roadnetwork.RUnit rUnit : rUnits) {
        ui.Coordinates coordinates = new ui.Coordinates(rUnit.getX(), rUnit.getY());
        if (((rUnit.getX()) == (intersectionCoordinates.getX())) & ((rUnit.getY()) == (intersectionCoordinates.getY()))) {
            java.lang.System.out.println("INTERSECTION");
            return rUnit;
        }
    }
    return null;
}