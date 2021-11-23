private ge.edu.freeuni.sdp.iot.router.House getHouseById(ge.edu.freeuni.sdp.iot.router.Houses houses, int houseId) {
    ge.edu.freeuni.sdp.iot.router.House house = houses.getHouse(houseId);
    if (house == null) {
        house = new ge.edu.freeuni.sdp.iot.router.House(houseId);
        houses.addHouse(house);
    }
    return house;
}