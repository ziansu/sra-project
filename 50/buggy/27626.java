@org.springframework.web.bind.annotation.RequestMapping(value = { "/index" }, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String greeting(@org.springframework.web.bind.annotation.RequestParam(value = "name", required = false, defaultValue = "World")
java.lang.String name, org.springframework.ui.Model model) {
    model.addAttribute("name", projectService.foo());
    return "index";
}