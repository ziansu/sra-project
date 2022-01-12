@org.springframework.web.bind.annotation.RequestMapping(value = "/update", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String processNewShipmentForm(edu.mum.domain.SingleOrder orderToBeUpdate, org.springframework.ui.Model model) {
    java.lang.System.out.println(order.getQuantity());
    java.lang.System.out.println(order.getStatus());
    java.lang.System.out.println(order.getUserInfo());
    order.setStatus(orderToBeUpdate.getStatus());
    orderService.update(order);
    org.springframework.context.ApplicationContext context = new org.springframework.context.support.ClassPathXmlApplicationContext("context/applicationContext.xml");
    edu.mum.service.mail.SendMailExample emailService = ((edu.mum.service.mail.SendMailExample) (context.getBean("sendMailExample")));
    emailService.sendMailWithTemplate("Samle", "Sample");
    return "redirect:/orders";
}