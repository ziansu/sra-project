public void clearOutMApCar() {
    java.util.ArrayList<Car> listOfCars2 = listOfCars;
    java.util.Iterator<Car> i = listOfCars2.iterator();
    while (i.hasNext()) {
        Car s = i.next();
        if (shouldRemoveFromTheList(s)) {
            s.removePosition();
            i.remove();
        }
    } 
}