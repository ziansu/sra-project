@org.springframework.web.bind.annotation.RequestMapping(value = "/deleteUser", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView deleteUser(javax.servlet.http.HttpServletRequest request) {
    java.lang.String email = request.getParameter("email");
    userService.softDelete(email);
    return new org.springframework.web.servlet.ModelAndView("redirect:/users");
}