@org.springframework.web.bind.annotation.RequestMapping(value = "/add/route", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String addRoute(javax.servlet.http.HttpServletRequest request, org.springframework.ui.Model model) {
    com.tsystems.jschool.railage.view.controllers.helpers.RouteFormParams params = new com.tsystems.jschool.railage.view.controllers.helpers.RouteFormParams();
    try {
        params.fill(request);
        params.validate();
        routeService.addRoute(params);
    } catch (com.tsystems.jschool.railage.service.exceptions.IncorrectStationsDepartureTimesOrderException | com.tsystems.jschool.railage.service.exceptions.IncorrectTimeFormatException | com.tsystems.jschool.railage.service.exceptions.DuplicatedStationsInRouteException e) {
        controllersUtils.addErrorMessage(model, e.getMessage());
    }
    controllersUtils.addRoutes2Model(model);
    return com.tsystems.jschool.railage.view.Pages.ROUTES;
}