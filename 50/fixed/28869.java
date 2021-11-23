public boolean park(Car car) {
    if ((parkingArea.size()) >= (parkingLotSize))
        throw new java.lang.IndexOutOfBoundsException("Parking lot is full.");
    
    return (parkingArea.put(car.getId(), car)) == null;
}