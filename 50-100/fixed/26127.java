private void checkResultAddShift(ca.mcgill.ecse321.foodtruck.model.Employee biceps, ca.mcgill.ecse321.foodtruck.model.FoodTruckManager ftms) {
    assertEquals(1, biceps.numberOfShifts(), ftms.getEmployee(0).numberOfShifts());
    assertEquals(true, biceps.hasShifts());
    assertEquals(true, ftms.getEmployee(0).hasShifts());
}