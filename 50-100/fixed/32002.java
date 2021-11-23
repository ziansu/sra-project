@org.springframework.web.bind.annotation.RequestMapping(value = { "/" , "/home" }, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView list() {
    java.util.HashMap<java.lang.String, java.lang.Object> model = new java.util.HashMap<java.lang.String, java.lang.Object>();
    model.put("case", new patrimoine.classes.Case());
    model.put("case2", new patrimoine.classes.Case());
    return new org.springframework.web.servlet.ModelAndView("patrimoine/index", model);
}