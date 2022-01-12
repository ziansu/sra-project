@org.springframework.web.bind.annotation.RequestMapping(value = { "/my-account" , "/account" , "/user-account" }, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView getMyAccountPage() {
    org.springframework.web.servlet.ModelAndView mav = new org.springframework.web.servlet.ModelAndView("user-account");
    mav.addObject("admin", controllerHelper.isAdmin());
    com.jms.respect.dao.User user = controllerHelper.getUser();
    mav.addObject("user", user);
    mav.addObject("accountUpdateDto", getAccountUpdateDtoForUser(user));
    return mav;
}