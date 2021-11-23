@org.springframework.web.bind.annotation.RequestMapping(value = "/getNation.html")
public org.springframework.web.servlet.ModelAndView getNation(javax.servlet.http.HttpSession session) {
    org.springframework.web.servlet.ModelAndView mav = new org.springframework.web.servlet.ModelAndView();
    java.util.ArrayList<com.autoparts.login.model.UserDto> list = null;
    try {
        list = userService.getNation();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    mav.setViewName("getMdeptselet");
    mav.addObject("list", list);
    return mav;
}