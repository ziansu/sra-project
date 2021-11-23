public void addCar(de.hm.edu.carads.models.Car car) {
    if (((car.getId()) == null) || (car.getId().isEmpty()))
        throw new java.lang.IllegalArgumentException();
    
    if ((cars) == null)
        this.cars = new java.util.ArrayList<de.hm.edu.carads.models.Car>();
    
    this.cars.add(car);
}