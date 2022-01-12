@org.springframework.web.bind.annotation.RequestMapping(value = "/profile", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView userProfile(javax.servlet.http.HttpSession httpSession) {
    org.springframework.web.servlet.ModelAndView mv = new org.springframework.web.servlet.ModelAndView();
    mv.addObject(ConstantUtil.LOGINUSER, httpSession.getAttribute(ConstantUtil.LOGINUSER));
    mv.setViewName("/user/profile");
    return mv;
}