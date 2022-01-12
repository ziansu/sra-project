@org.springframework.web.bind.annotation.RequestMapping(value = "/customers/{id}")
CustomerProtos.Customer customer(@org.springframework.web.bind.annotation.PathVariable
java.lang.Integer id) {
    return this.customerRepository.findById(id);
}