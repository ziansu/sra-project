private java.util.Collection<de.hm.edu.carads.models.Car> enrichCars() {
    java.util.Collection<de.hm.edu.carads.models.Car> enrichedCars = new java.util.ArrayList<de.hm.edu.carads.models.Car>();
    if ((cars) == null)
        this.cars = new java.util.ArrayList<de.hm.edu.carads.models.Car>();
    
    java.util.Iterator<de.hm.edu.carads.models.Car> it = cars.iterator();
    while (it.hasNext()) {
        de.hm.edu.carads.models.Car tmp = it.next();
        tmp.setDriverInformation(this.getId(), zip);
        enrichedCars.add(tmp);
    } 
    return enrichedCars;
}