public course.ParkingLot getParkingLot(java.util.List<course.ParkingLot> parkingLotList) {
    course.ParkingLot maxParkingLot = null;
    for (course.ParkingLot parkingLot : parkingLotList) {
        if ((maxParkingLot == null) || ((parkingLot.idleSpace()) > (maxParkingLot.idleSpace()))) {
            maxParkingLot = parkingLot;
        }
    }
    return maxParkingLot;
}