@org.springframework.web.bind.annotation.RequestMapping(value = "/")
public java.lang.String index(org.springframework.ui.Model model) {
    java.lang.String pageTitle = "Hello";
    model.addAttribute("pageTitle", pageTitle);
    return "index";
}