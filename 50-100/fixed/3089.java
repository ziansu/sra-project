public boolean canMoveNumSpaces(RowCol start, int numSpaces) {
    if (!(isLocationEmpty(start))) {
        return false;
    }
    RowCol[] locations = generateLocations(start, numSpaces);
    for (int i = 0; i < (locations.length); i++) {
        if (!(isLocationEmpty(locations[i]))) {
            return false;
        }
    }
    return true;
}