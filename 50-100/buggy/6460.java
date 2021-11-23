public java.lang.Boolean moveToDecision(Objects.Car car, Controllers.CarFlow.Direction dirDestination, Controllers.CarFlow.Direction dirJunction, int destination, Objects.Terrain t) {
    for (int i = 0; i < (car.getLength()); i++) {
        car.move(dirJunction);
    }
    car.turn(dirDestination);
    for (int i = 0; i < (car.getLength()); i++) {
        car.move(dirDestination);
    }
    return true;
}