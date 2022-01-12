@org.junit.Test
public void testRemoveBookingWithPreviousBookingButUnendedRemoveCandidate() {
    testee.addBooking(testBookings, de.lgblaumeiser.ptm.datamanager.service.BookingServiceTest.ACTIVITY1, de.lgblaumeiser.ptm.datamanager.service.BookingServiceTest.TIME1);
    de.lgblaumeiser.ptm.datamanager.model.Booking testBooking = testee.addBooking(testBookings, de.lgblaumeiser.ptm.datamanager.service.BookingServiceTest.ACTIVITY2, de.lgblaumeiser.ptm.datamanager.service.BookingServiceTest.TIME2);
    testee.removeBooking(testBookings, testBooking);
    org.junit.Assert.assertEquals(1, testBookings.getBookings().size());
    org.junit.Assert.assertEquals(de.lgblaumeiser.ptm.datamanager.service.BookingServiceTest.TIME1, testBookings.getLastBooking().getStarttime());
    org.junit.Assert.assertFalse(testBookings.getLastBooking().hasEndtime());
}