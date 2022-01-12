@org.springframework.web.bind.annotation.RequestMapping(value = "/update", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String processNewShipmentForm(edu.mum.domain.SingleOrder orderToBeUpdate, org.springframework.ui.Model model) {
    java.lang.System.out.println(order.getQuantity());
    java.lang.System.out.println(order.getStatus());
    java.lang.System.out.println(order.getUserInfo());
    order.setStatus(orderToBeUpdate.getStatus());
    orderService.update(order);
    emailService.sendMailWithTemplate("Samle", "Sample");
    return "redirect:/orders";
}