private cz.fi.muni.pa036.airticketbooking.api.dto.FlightPriceDto eliminateInfiniteRecursive(cz.fi.muni.pa036.airticketbooking.api.dto.FlightPriceDto flightPrice) {
    if ((flightPrice.getFlight()) != null) {
        flightPrice.getFlight().setAirportByAirportFromId(null);
        flightPrice.getFlight().setAirportByAirportToId(null);
        flightPrice.getFlight().setFlightPrices(null);
        flightPrice.getFlight().setFlightTickets(null);
        flightPrice.getFlight().setPlane(null);
    }
    return flightPrice;
}