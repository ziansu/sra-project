@org.springframework.web.bind.annotation.RequestMapping(value = "/logout")
public org.springframework.web.servlet.ModelAndView logout(javax.servlet.http.HttpServletRequest request) {
    request.getSession().invalidate();
    request.getSession().removeAttribute("loginInfo");
    return new org.springframework.web.servlet.ModelAndView("logout");
}