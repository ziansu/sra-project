@org.junit.Test
public void testFindInvalidPriceDirectFlexibleFlights() throws java.sql.SQLException {
    assertTrue("This flight should not have existsed", ((com.FlightSearch.Tests.DatabaseInteractionTest.di.findDirectFlights(com.FlightSearch.Tests.DatabaseInteractionTest.validDepDate, com.FlightSearch.Tests.DatabaseInteractionTest.validDepAirpCode, com.FlightSearch.Tests.DatabaseInteractionTest.validArrAirpCode, com.FlightSearch.Tests.DatabaseInteractionTest.invalidPrice, true).size()) == 0));
}