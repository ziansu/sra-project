public void changeLane(int carIndex) {
    Car car = cars.get(carIndex);
    cars.remove(carIndex);
    numCars = cars.size();
    java.lang.System.out.print((((("Lane " + (laneIndex)) + " has ") + (numCars)) + " cars after one left."));
    TrafficSimulator.lanes.get(newLaneIndex).addCar(car, ((laneIndex) - (newLaneIndex)));
}