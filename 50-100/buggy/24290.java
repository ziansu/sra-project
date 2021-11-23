@org.springframework.web.bind.annotation.RequestMapping(value = "/rooms/{id}", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public org.springframework.http.ResponseEntity<com.roommanagement.beans.Room> getRoom(@org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.String id, @org.springframework.web.bind.annotation.RequestHeader
java.lang.String authToken) {
    if (service.checkAdmin(authToken)) {
    }
    org.springframework.http.HttpStatus httpStatus = null;
    com.roommanagement.beans.Room requiredRoom = roomservice.getRoom(id);
    if (requiredRoom == null) {
        httpStatus = org.springframework.http.HttpStatus.NOT_FOUND;
    }else {
        httpStatus = org.springframework.http.HttpStatus.FOUND;
    }
    org.springframework.http.HttpHeaders httpHeaders = new org.springframework.http.HttpHeaders();
    return new org.springframework.http.ResponseEntity<com.roommanagement.beans.Room>(requiredRoom, httpHeaders, httpStatus);
}