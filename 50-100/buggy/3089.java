public boolean canMoveNumSpaces(RowCol start, int numSpaces) {
    RowCol[] locations = generateLocations(start, numSpaces);
    for (int i = 0; i < (locations.length); i++) {
        if (!(isLocationEmpty(locations[i]))) {
            return false;
        }
    }
    return true;
}