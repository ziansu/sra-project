@org.springframework.web.bind.annotation.RequestMapping(value = "/resetInfo")
public org.springframework.web.servlet.ModelAndView resetInfo(javax.servlet.http.HttpServletRequest request, org.springframework.ui.Model model) {
    org.apache.shiro.subject.Subject subject = org.apache.shiro.SecurityUtils.getSubject();
    java.lang.String email = subject.getSession().getAttribute("email").toString();
    org.springframework.web.servlet.ModelAndView modelView = new org.springframework.web.servlet.ModelAndView();
    if (email != null) {
        java.util.Optional<com.cidic.design.model.User> user = userServiceImpl.findByEmail(email);
        modelView.addObject(user.get());
        modelView.setViewName("/frontend/resetInfo");
    }else {
        modelView.setViewName("/frontend/login");
    }
    return modelView;
}