@org.springframework.web.bind.annotation.RequestMapping(value = "/orderlist", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String getAllOrder(org.springframework.ui.Model model) {
    model.addAttribute("orders", orderRestClient.getAllOrder());
    model.addAttribute("order", new edu.mum.coffee.domain.Order());
    return "listOrders";
}