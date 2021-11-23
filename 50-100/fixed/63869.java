@com.projectx.main.RequestMapping(path = "/services/{id}", method = RequestMethod.GET)
public org.springframework.http.ResponseEntity<?> getServiceInfo(@com.projectx.main.PathVariable
long id) {
    com.projectx.model.Service service = serviceDAO.getServiceById(id);
    if (service == null) {
        com.projectx.main.ServiceController.logger.debug("Failed getting info about service with id={} - it doesn't exist", id);
        return org.springframework.http.ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
    com.projectx.main.ServiceController.logger.debug("Getting info for service {} is successful, info: {}", id, service);
    return org.springframework.http.ResponseEntity.ok(service);
}