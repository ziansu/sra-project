@org.springframework.web.bind.annotation.RequestMapping(value = "/joinInfo.html")
public org.springframework.web.servlet.ModelAndView registerInfo(javax.servlet.http.HttpSession session) throws java.lang.Exception {
    java.lang.System.out.println(((java.lang.String) (session.getAttribute("id"))));
    userDto = userService.getUserInfo(((java.lang.String) (session.getAttribute("id"))));
    org.springframework.web.servlet.ModelAndView mav = new org.springframework.web.servlet.ModelAndView();
    mav.addObject("userInfo", userDto);
    java.lang.System.out.println("test-----");
    mav.setViewName("join/joinInfo");
    return mav;
}