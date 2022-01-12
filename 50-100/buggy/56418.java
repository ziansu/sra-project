private void checkResultRemoveShift(ca.mcgill.ecse321.foodtruck.model.Employee biceps, ca.mcgill.ecse321.foodtruck.model.FoodTruckManager ftms) {
    assertEquals(0, biceps.numberOfShifts(), ftms.getEmployee(0).numberOfShifts());
    assertEquals(biceps.getShift(0), ftms.getEmployee(0).getShift(0));
    assertEquals(false, biceps.hasShifts());
    assertEquals(false, ftms.getEmployee(0).hasShifts());
}