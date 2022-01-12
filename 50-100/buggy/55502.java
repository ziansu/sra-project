@java.lang.Override
public java.lang.String execute(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    int id = java.lang.Integer.parseInt(request.getRequestURI().replaceAll("\\D+", ""));
    java.util.Optional<com.havryliuk.entity.Customer> customer = new com.havryliuk.service.CustomerService().getCustomerById(id);
    if (customer.isPresent()) {
        request.setAttribute("customer", customer);
        return "customer.jsp";
    }else {
        return "error.jsp";
    }
}