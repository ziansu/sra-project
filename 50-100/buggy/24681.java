private boolean validatePlacement(Ship.Ships ship, java.lang.String coordinates, java.lang.String direction) {
    if (!(Ship.areCoordinatesValid(ship, coordinates, direction))) {
        java.lang.System.out.println("The coordinates or direction you entered were not valid please enter a valid response.");
        placeHumanShips();
    }
    boolean overlap = wasHit(currentPlayer, coordinates);
    if (overlap) {
        java.lang.System.out.println("Your requested coordinates overlap with an existing ship. Please select again.");
        placeHumanShips();
    }
    return true;
}