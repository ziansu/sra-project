@org.springframework.web.bind.annotation.RequestMapping(value = "/customer/edit/{customerId}")
public java.lang.String editCustomer(@org.springframework.web.bind.annotation.PathVariable(value = "customerId")
int customerId, org.springframework.ui.Model model) throws com.reminisense.ra.exception.CustomerNotFoundException {
    com.reminisense.ra.entity.CustomerEntity customer = this.customerService.getCustomerById(customerId);
    if (customer == null) {
        throw new com.reminisense.ra.exception.CustomerNotFoundException();
    }
    model.addAttribute("customer");
    model.addAttribute("listCustomer", this.customerService.listCustomers());
    return "customer.jsp";
}