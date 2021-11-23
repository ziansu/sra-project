@org.springframework.web.bind.annotation.RequestMapping(value = "/")
public org.springframework.web.servlet.ModelAndView index() {
    java.lang.System.out.println(this.exampleProperty);
    return new org.springframework.web.servlet.ModelAndView("index");
}