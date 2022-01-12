@org.springframework.security.access.annotation.Secured(value = "ROLE_ADMIN")
@org.springframework.web.bind.annotation.RequestMapping(value = "/Switch")
protected org.springframework.web.servlet.ModelAndView mainController(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    org.springframework.web.servlet.ModelAndView model = new org.springframework.web.servlet.ModelAndView("/SwitchFile");
    flag2 = dummy.AppController.flag.flag;
    try {
        dummy.AppController.flag.flag = request.getParameter("on").toString();
    } catch (java.lang.Exception ex) {
        dummy.AppController.flag.flag = flag2;
    }
    model.addObject("req", dummy.AppController.flag.flag);
    return model;
}