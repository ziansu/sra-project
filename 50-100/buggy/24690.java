@com.airlines.RequestMapping(path = "/passenger/{id}", method = RequestMethod.GET, produces = { "application/json" })
public org.springframework.http.ResponseEntity getPassengerJson(@com.airlines.PathVariable(value = "id")
java.lang.Long id) {
    try {
        com.airlines.Passenger passenger = passengerRepository.findOne(id);
        if (passenger == null) {
            return new org.springframework.http.ResponseEntity(noPassengerFound(id, "not found"), org.springframework.http.HttpStatus.NOT_FOUND);
        }
        return new org.springframework.http.ResponseEntity(passenger, org.springframework.http.HttpStatus.OK);
    } catch (java.lang.Exception e) {
        return new org.springframework.http.ResponseEntity(e.toString(), org.springframework.http.HttpStatus.BAD_REQUEST);
    }
}