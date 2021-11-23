public src.model.Location getFirstFreeLocation() {
    for (int floor = 0; floor < (getNumberOfFloors()); floor++) {
        for (int row = 0; row < (getNumberOfRows()); row++) {
            for (int place = 0; place < (getNumberOfPlaces()); place++) {
                src.model.Location location = new src.model.Location(floor, row, place);
                if ((getCarAt(location)) == null) {
                    return location;
                }
            }
        }
    }
    return null;
}