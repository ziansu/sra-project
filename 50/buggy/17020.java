@org.springframework.web.bind.annotation.RequestMapping(value = "/index", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String index(org.springframework.ui.Model model) {
    model.addAttribute("system", "guru");
    return "index";
}