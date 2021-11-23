public boolean compareBuildings(Domain.Building b1, Domain.Building b2) {
    boolean equals;
    equals = b1.getBuildingName().equals(b2.getBuildingName());
    if ((((b1.getBuildingSize()) != (b2.getBuildingSize())) || ((b1.getBuildingYear()) != (b2.getBuildingYear()))) || ((b1.getListOfRooms()) != (b2.getListOfRooms()))) {
        equals = false;
    }
    return equals;
}