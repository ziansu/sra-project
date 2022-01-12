@org.springframework.web.bind.annotation.RequestMapping(value = "/delete/{id}")
public java.lang.String deleteCustomer(@org.springframework.web.bind.annotation.PathVariable
java.lang.Integer id) {
    customerService.delete(id);
    return "redirect:/customer/list";
}