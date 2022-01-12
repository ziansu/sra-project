@org.springframework.web.bind.annotation.RequestMapping(value = "/{id}")
public com.fict.entities.Customer sayHello(@org.springframework.web.bind.annotation.PathVariable
java.lang.Long id) {
    com.fict.entities.Customer customer = service.findTestEntityById(id);
    return customer;
}