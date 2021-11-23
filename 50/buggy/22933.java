@org.springframework.web.bind.annotation.RequestMapping(value = "/buy", method = org.springframework.web.bind.annotation.RequestMethod.POST, headers = "Accept=application/json")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String buy(@org.springframework.web.bind.annotation.RequestBody
netckr.shop.model.Order order) {
    java.lang.System.out.println("sdcsdcas");
    java.lang.System.out.println(order);
    this.cartService.saveCustomer(order.getUser());
    this.cartService.saveOrder(order);
    return "Order succesfully completed";
}