@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET, value = "/")
public org.springframework.web.servlet.ModelAndView navigateToIndex(javax.servlet.http.HttpServletResponse response) {
    initControllerResources(response);
    java.util.Map<java.lang.String, java.lang.Object> model = com.services.shared.ServiceManager.getInstance().getSharedResources().getModel();
    com.services.OfferService offerService = com.services.shared.ServiceManager.getInstance().getOfferService();
    java.util.List<com.model.Offer> offers = offerService.listAllOffers();
    model.put("offers", offers);
    java.lang.System.out.println();
    return buildModelAndView("index");
}