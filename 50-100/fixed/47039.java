public void testCheckSeatIsValid() throws java.lang.Exception {
    BusinessLogic.Seat seat = new BusinessLogic.Seat(1, 1, 1);
    java.lang.System.out.println(Dao.CheckReservation.checkSeatIsValid(seat));
    assertEquals(Dao.CheckReservation.checkSeatIsValid(seat), true);
    BusinessLogic.Seat seat2 = new BusinessLogic.Seat(2, 2, 1);
    java.lang.System.out.println(Dao.CheckReservation.checkSeatIsValid(seat2));
    assertEquals(Dao.CheckReservation.checkSeatIsValid(seat2), false);
}