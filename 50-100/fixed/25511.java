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
    departureDate = null;
    oneWay = false;
}