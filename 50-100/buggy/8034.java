@org.springframework.web.bind.annotation.RequestMapping(value = "/customer", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String postNewCustomer(@javax.websocket.server.PathParam(value = "fullname")
java.lang.String fullname, @javax.websocket.server.PathParam(value = "address")
java.lang.String address, @javax.websocket.server.PathParam(value = "age")
int age, org.springframework.ui.ModelMap modelMap) {
    customerModel.addNewCustomer(fullname, address, age);
    java.util.List<bankapp.entity.Customer> customersList = customerService.findAll();
    modelMap.addAttribute("customersList", customersList);
    return "customers";
}