public boolean setCarAt(src.model.Location location, src.model.Car car) {
    if (!(locationIsValid(location))) {
        return false;
    }
    src.model.Car oldCar = getCarAt(location);
    if (oldCar == null) {
        cars[location.getFloor()][location.getRow()][location.getPlace()] = car;
        car.setLocation(location);
        return true;
    }
    return false;
}