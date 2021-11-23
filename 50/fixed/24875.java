@org.junit.Test(expected = java.lang.IllegalStateException.class)
public void testAddBooking0Empty() {
    testee.addBooking(de.lgblaumeiser.ptm.datamanager.service.DayBookingsTest.ACTIVITY1);
}