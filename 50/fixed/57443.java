@org.springframework.web.bind.annotation.RequestMapping(value = "/welcome")
public org.springframework.web.servlet.ModelAndView helloWorld() {
    java.lang.String message = "0";
    return new org.springframework.web.servlet.ModelAndView("welcome", "message", message);
}