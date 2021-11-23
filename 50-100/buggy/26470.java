@org.springframework.web.bind.annotation.RequestMapping(value = "/order/create", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String createOrder(@org.springframework.web.bind.annotation.RequestParam(value = "productIds")
java.lang.Integer[] productIds) {
    com.github.nastyakimova.onlineshop.controller.OrderController.LOG.info("Received request to create new order");
    org.springframework.security.core.Authentication authentication = org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication();
    com.github.nastyakimova.onlineshop.entity.Customer customer = customerService.getCustomerByEmail(authentication.getName());
    java.util.List<com.github.nastyakimova.onlineshop.entity.Product> products = new java.util.ArrayList<>();
    for (int id : productIds) {
        products.add(productService.getProductById(id));
    }
    orderService.createOrder(customer, new com.github.nastyakimova.onlineshop.entity.Order(), products);
    return "payment";
}