@java.lang.Override
public java.util.List<BIF.SWE2.exam.Car> getCars() {
    if ((brand) == null) {
        throw new java.lang.IllegalStateException("No brand is set.");
    }
    java.util.List<BIF.SWE2.exam.Car> cars = carDAL.GetCars(brand, null);
    return cars;
}