@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.http.ResponseEntity<com.joust.backend.core.model.Heartbeat> get() {
    org.springframework.http.ResponseEntity<com.joust.backend.core.model.Heartbeat> response = new org.springframework.http.ResponseEntity<com.joust.backend.core.model.Heartbeat>(heartbeat.toBuilder().build(), org.springframework.http.HttpStatus.OK);
    return response;
}