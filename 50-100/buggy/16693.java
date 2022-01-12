@org.springframework.web.bind.annotation.RequestMapping(path = "/notification/create", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String greeting(@org.springframework.web.bind.annotation.RequestParam(value = "eventUrl", required = true)
java.lang.String eventUrl, org.springframework.ui.Model model) {
    org.springframework.web.client.RestTemplate restTemplate = new org.springframework.web.client.RestTemplate();
    paquitoapp.model.notification.Notification notification = restTemplate.getForObject("eventUrl", paquitoapp.model.notification.Notification.class);
    paquitoapp.controller.NotificationController.LOGGER.info(notification.toString());
    model.addAttribute("eventUrl", eventUrl);
    paquitoapp.controller.NotificationController.LOGGER.info(("Subscription CREATE notification. URL: " + eventUrl));
    return "greeting";
}