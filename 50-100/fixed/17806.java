@com.example.service.customer.controller.RequestMapping(path = "/{customerId}", method = RequestMethod.GET)
public org.springframework.http.ResponseEntity<com.example.service.customer.domain.Customer> getCustomer(@com.example.service.customer.controller.PathVariable(value = "customerId")
java.lang.Long customerId, @com.example.service.customer.controller.RequestParam(required = true)
java.lang.String name) {
    com.example.service.customer.domain.Customer customer = customerService.getCustomer(customerId);
    if (customer != null) {
        return new org.springframework.http.ResponseEntity<com.example.service.customer.domain.Customer>(customer, org.springframework.http.HttpStatus.OK);
    }
    return new org.springframework.http.ResponseEntity<com.example.service.customer.domain.Customer>(org.springframework.http.HttpStatus.NOT_FOUND);
}