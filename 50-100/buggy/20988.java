@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.PUT)
public org.springframework.http.ResponseEntity update(@org.springframework.web.bind.annotation.RequestBody
com.mrzolution.integridad.app.domain.Client client) {
    log.info("ClientController update: {}", client);
    com.mrzolution.integridad.app.domain.Client response = null;
    try {
        response = service.update(client);
    } catch (com.mrzolution.integridad.app.exceptions.BadRequestException e) {
        log.error("ClientController create Exception thrown: {}", e.getMessage());
        return org.springframework.http.ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    }
    return new org.springframework.http.ResponseEntity<com.mrzolution.integridad.app.domain.Client>(response, org.springframework.http.HttpStatus.CREATED);
}