@org.junit.Test
public void testFindInvalidArrAirpDirectFlights() throws java.sql.SQLException {
    assertNull("This flight should not have existsed", com.FlightSearch.Tests.DatabaseInteractionTest.di.findDirectFlights(com.FlightSearch.Tests.DatabaseInteractionTest.validDepDate, com.FlightSearch.Tests.DatabaseInteractionTest.validDepAirpCode, com.FlightSearch.Tests.DatabaseInteractionTest.invalidAirpCode, com.FlightSearch.Tests.DatabaseInteractionTest.validPrice, false));
}