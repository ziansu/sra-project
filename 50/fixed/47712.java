@org.springframework.web.bind.annotation.RequestMapping(value = "/size")
public org.springframework.web.servlet.ModelAndView sizeTasks() {
    org.springframework.web.servlet.ModelAndView mav = new org.springframework.web.servlet.ModelAndView("size");
    mav.addObject("size", adminService.size());
    return mav;
}