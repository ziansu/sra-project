private java.util.ArrayList<frogger.ObstacleRow<frogger.Car>> initializeCarRows() {
    java.util.ArrayList<frogger.ObstacleRow<frogger.Car>> newCars = new java.util.ArrayList<>();
    frogger.ObstacleRow<frogger.Car> car1 = new frogger.ObstacleRow((-75), 150, 500, 50, 2, 500, new java.util.ArrayList<>(), 2, 3, java.awt.Color.BLACK);
    newCars.add(car1);
    return newCars;
}