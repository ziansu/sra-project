public boolean compareBuildings(Domain.Building b1, Domain.Building b2) {
    boolean equals;
    equals = b1.getBuildingName().equals(b2.getBuildingName());
    if (((b1.getBuildingSize()) != (b2.getBuildingSize())) || ((b1.getBuildingYear()) != (b2.getBuildingYear()))) {
        equals = false;
    }
    return equals;
}