@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET, path = "/customer/{id}")
public org.springframework.http.ResponseEntity<com.noname.digital.model.Customer> getCustomer(@javax.websocket.server.PathParam(value = "id")
long id) {
    log.debug("Invoked load customer id [{}]", id);
    return new org.springframework.http.ResponseEntity(pfmDataAccess.getCustomer(id), org.springframework.http.HttpStatus.OK);
}