@org.springframework.web.bind.annotation.RequestMapping(value = "/payok", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.web.servlet.ModelAndView payOkPost(org.springframework.ui.Model model) {
    return new org.springframework.web.servlet.ModelAndView("redirect:/");
}