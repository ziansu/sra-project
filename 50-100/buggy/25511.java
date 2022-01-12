@javax.annotation.PostConstruct
public void setUp() {
    numberOfPersons = 1;
    departureAirport = "";
    destinationAirport = "";
    departureDay = "";
    returnDay = "";
    category = "";
    airline = "";
    currentDate = new java.util.Date();
    returnDate = null;
    departureDate = null;
    oneWay = true;
}