@org.junit.Test
public void updateShiftCatch() {
    org.team8.webapp.Shift.Shift dummy = new org.team8.webapp.Shift.Shift(4, 1, 1, 1);
    TestJUnitDB.shiftDAO.createShift(dummy);
    org.team8.webapp.Shift.Shift updated = new org.team8.webapp.Shift.Shift(5, 2, 2, 2);
    assertFalse(TestJUnitDB.shiftResource.updateShift(updated));
    TestJUnitDB.shiftDAO.removeShift(updated.getShift_id());
}