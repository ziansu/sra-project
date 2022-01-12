@org.springframework.web.bind.annotation.RequestMapping(value = "/")
public org.springframework.web.servlet.ModelAndView landing() {
    org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView();
    modelAndView.setViewName("landing");
    org.springframework.security.core.Authentication auth = org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication();
    if (auth.getAuthorities().toString().equals("[MEMBER]")) {
        com.csc.mfs.model.User user = userService.findUserByEmail(auth.getName());
        modelAndView.addObject("userName", user.getName());
        java.lang.System.out.println(user.getName());
    }
    return modelAndView;
}