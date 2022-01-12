public Listable copy() {
    ListHouse result = new ListHouse(lotNumber, firstName, lastName, listedPrice, squareFeet, noOfBedRooms);
    return result;
}