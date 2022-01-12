private void setValueInHouses(int value, boolean inHouse) {
    row.setValueInHouse(value, inHouse, index);
    column.setValueInHouse(value, inHouse, index);
    zone.setValueInHouse(value, inHouse, index);
}