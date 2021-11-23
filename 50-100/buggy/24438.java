@java.lang.Override
public void saveCar(BIF.SWE2.exam.Car c) {
    if ((brand) == null) {
        throw new java.lang.IllegalStateException("No brand is set.");
    }
    if (!(c.getBrand().equalsIgnoreCase(brand))) {
        throw new java.lang.IllegalStateException("The car does not belong to the current brand.");
    }
    carDAL.SaveCar(c);
}