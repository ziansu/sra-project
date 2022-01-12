@org.springframework.web.bind.annotation.RequestMapping(value = "/history", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String getCurrentDriverHistory(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.RequestParam
java.util.Map<java.lang.String, java.lang.String> requestParam) {
    org.springframework.security.core.context.SecurityContext context = org.springframework.security.core.context.SecurityContextHolder.getContext();
    org.springframework.security.core.Authentication authentication = context.getAuthentication();
    com.teamd.taxi.authentication.AuthenticatedUser auth = ((com.teamd.taxi.authentication.AuthenticatedUser) (authentication.getPrincipal()));
    com.teamd.taxi.controllers.driver.Driver driver = driverService.getDriver(((int) (auth.getId())));
    setViewHistory(model, requestParam, driver);
    return "driver/drv-history";
}