@org.springframework.web.bind.annotation.RequestMapping(value = "/rooms/{start}/{end}", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public org.springframework.http.ResponseEntity<java.util.List<com.roommanagement.beans.Room>> roomRange(@org.springframework.web.bind.annotation.PathVariable(value = "start")
int start, @org.springframework.web.bind.annotation.RequestHeader
java.lang.String authToken, @org.springframework.web.bind.annotation.PathVariable(value = "end")
int end) {
    org.springframework.http.HttpHeaders httpHeaders = new org.springframework.http.HttpHeaders();
    return new org.springframework.http.ResponseEntity<java.util.List<com.roommanagement.beans.Room>>(roomservice.roomRange(start, end), httpHeaders, org.springframework.http.HttpStatus.FOUND);
}