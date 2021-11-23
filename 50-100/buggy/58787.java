@org.springframework.web.bind.annotation.RequestMapping(value = "/showAll")
public java.lang.String all() {
    java.lang.String show_data = "";
    int index = 0;
    for (edgar.Customers customer : customerManager.findAll()) {
        index += 1;
        show_data = (((((((((show_data + index) + "  ") + "    ") + (customer.name)) + "    ") + (customer.surname)) + "    ") + (customer.email)) + "    ") + customer;
        show_data += "</br>";
    }
    return show_data;
}