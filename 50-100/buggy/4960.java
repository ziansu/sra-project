public java.util.List<resource.ea.Car> createCars() {
    for (int i = 0; i <= (main.Main.numCars); i++) {
        resource.ea.Car car = new resource.ea.Car();
        resource.ea.Owner owner = new resource.ea.Owner(car);
        car.setOwner(owner);
        cars.add(car);
    }
    return cars;
}