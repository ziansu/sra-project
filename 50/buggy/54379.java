public final mytown.datasource.Town newTown(java.lang.String name, mytown.datasource.Resident creator) {
    mytown.datasource.Town town = new mytown.datasource.Town(name);
    configureTown(town, creator);
    return town;
}