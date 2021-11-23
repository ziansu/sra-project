private src.model.Car removeCarAt(src.model.Location location) {
    if (!(locationIsValid(location))) {
        return null;
    }
    src.model.Car car = getCarAt(location);
    if (car == null) {
        return null;
    }
    cars[location.getFloor()][location.getRow()][location.getPlace()] = null;
    car.setLocation(null);
    return car;
}