@org.junit.Test
public void showAllAvailableCars() throws java.lang.Exception {
    carService.saveCar(car);
    java.util.List<com.rentacar.model.Car> carList = carService.showAllAvailableCars();
    assertNotNull(carList);
    for (com.rentacar.model.Car c : carList) {
        assertEquals(CarAvailability.AVAILABLE, c.getAvailability());
    }
}