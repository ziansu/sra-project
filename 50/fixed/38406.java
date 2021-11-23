@javax.ws.rs.GET
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public org.springframework.data.domain.Page<com.arnav.model.customer.Customer> findAll(org.springframework.data.domain.Pageable pageble) {
    return customerRepository.findAll(pageble);
}