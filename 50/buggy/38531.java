public Listable copy() {
    ListHouse result = new ListHouse(lotNumber, lastName, firstName, listedPrice, squareFeet, noOfBedRooms);
    return result;
}