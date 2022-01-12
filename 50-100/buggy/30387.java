public course.ParkingLot getParkingLot(java.util.List<course.ParkingLot> parkingLotList) {
    course.ParkingLot maxParkingLot = parkingLotList.get(0);
    for (course.ParkingLot parkingLot : parkingLotList) {
        if ((parkingLot.idleSpace()) > (maxParkingLot.idleSpace())) {
            maxParkingLot = parkingLot;
        }
    }
    return maxParkingLot;
}