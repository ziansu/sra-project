@org.springframework.web.bind.annotation.RequestMapping(value = "user-center", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView showUserCenter(javax.servlet.http.HttpServletRequest request) {
    java.lang.String menu = request.getParameter("menu");
    java.util.Map<java.lang.String, java.lang.Object> models = null;
    if ("position".equals(menu)) {
        models = new java.util.HashMap<java.lang.String, java.lang.Object>();
        models.put("menu", menu);
    }
    return new org.springframework.web.servlet.ModelAndView(com.imis.presentation.controller.LoginController.USER_CENTER_PAGE, models);
}