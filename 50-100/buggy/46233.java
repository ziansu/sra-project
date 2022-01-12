private void checkResultAddStaff(java.lang.String staffName, ca.mcgill.ecse321.foodtruck.model.FoodTruckManager ftms) {
    assertEquals(staffName, ftms.getEmployee(0));
    assertEquals(1, ftms.getEmployees().size());
    assertEquals(true, ftms.hasEmployees());
}