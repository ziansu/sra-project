@com.tsystems.javaschool.view.controllers.RequestMapping(method = RequestMethod.GET)
public java.lang.String mainPage(javax.servlet.http.HttpServletRequest request) {
    com.tsystems.javaschool.dao.entity.Client client = clientController.actualizeClient(request, "Guest");
    actualizeCart(request, client);
    return "pages/cart";
}