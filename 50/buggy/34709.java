@javax.jws.WebMethod(operationName = "getFlights")
public java.util.ArrayList<dk.dtu.FlightInfo> getFlights(java.lang.String origin, java.lang.String destination, javax.xml.datatype.XMLGregorianCalendar startDate) {
    dk.dtu.FlightInfo a = new dk.dtu.FlightInfo();
    java.util.ArrayList<dk.dtu.FlightInfo> strings = new java.util.ArrayList<dk.dtu.FlightInfo>();
    strings.add(a);
    return strings;
}