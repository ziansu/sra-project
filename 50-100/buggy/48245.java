@it.sevenbits.graphicartsindustry.web.controllers.RequestMapping(value = "/", method = RequestMethod.GET)
public java.lang.String index(final org.springframework.ui.Model model) throws it.sevenbits.graphicartsindustry.service.ServiceException {
    model.addAttribute("services", contentService.findFrequentServices(limitRadioButton));
    model.addAttribute("paymentMethods", contentService.findPaymentMethods());
    model.addAttribute("deliveryMethods", contentService.findDeliveryMethods());
    model.addAttribute("form", new it.sevenbits.graphicartsindustry.web.forms.SearchForm());
    model.addAttribute("polygraphyiesIsNull", "");
    model.addAttribute("polygraphies", searchService.findAllAllowedPolygraphy(limitPolygraphy));
    return "home/index";
}