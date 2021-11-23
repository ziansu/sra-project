public void addCar(de.hm.edu.carads.models.Car car) {
    if (((car.getId()) == null) || (car.getId().isEmpty()))
        throw new java.lang.IllegalArgumentException();
    
    this.cars.add(car);
}