@org.springframework.web.bind.annotation.RequestMapping(value = "/{id}")
public java.lang.String sayHello(@org.springframework.web.bind.annotation.PathVariable
java.lang.Long id) {
    com.fict.entities.Customer customer = service.findTestEntityById(id);
    return customer.getFirstName();
}