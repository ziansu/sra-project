@org.springframework.web.bind.annotation.RequestMapping(value = { "" , "/all" }, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView getAllUsersPage() {
    final org.springframework.web.servlet.ModelAndView modelAndView = this.fabric.getDefaultModelAndView();
    modelAndView.addObject("users", this.userService.getPersonnel());
    modelAndView.addObject("is_captcha", null);
    modelAndView.setViewName("user/all");
    return modelAndView;
}