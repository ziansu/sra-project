@org.junit.Before
public void setUp() throws java.lang.Exception {
    com.airline.DataSource dataSource = com.airline.utils.Util.loadFileToObject("init.json", com.airline.DataSource.class);
    flightService = new com.airline.service.FlightService(dataSource);
    flight = new com.airline.bean.Flight("BJ1001", "AAA170512-BJ1001", "10:00:00", "12:00:00", "Beijing", "Hangzhou", "2017-06-13", 10, 10);
    flight2 = new com.airline.bean.Flight("BJ1001", "AAA170801-BJ1001", "10:00:00", "12:00:00", "Beijing", "Hangzhou", "2017-08-01", 10, 10);
}