@org.springframework.web.bind.annotation.RequestMapping(value = "/hello")
public org.springframework.web.servlet.ModelAndView showMessage(@org.springframework.web.bind.annotation.RequestParam(value = "name", required = false, defaultValue = "World")
java.lang.String name) {
    org.springframework.web.servlet.ModelAndView mv = new org.springframework.web.servlet.ModelAndView("helloworld");
    mv.addObject("message", msg);
    mv.addObject("name", name);
    return mv;
}