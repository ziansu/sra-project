@org.springframework.web.bind.annotation.RequestMapping(value = "getFormattedSeats/{flightId}")
public org.springframework.http.ResponseEntity<com.gc.dto.FormattedSeatsDTO> getFormattedFlightSeats(@org.springframework.web.bind.annotation.PathVariable(value = "flightId")
int flightId) {
    com.gc.dto.FormattedSeatsDTO seats = new com.gc.dto.FormattedSeatsDTO(dataService.findSeatsByFlight(dataService.findFlightById(flightId)));
    return new org.springframework.http.ResponseEntity(seats, (seats.isEmpty() ? org.springframework.http.HttpStatus.NOT_FOUND : org.springframework.http.HttpStatus.ACCEPTED));
}