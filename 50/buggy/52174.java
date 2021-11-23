@org.springframework.web.bind.annotation.RequestMapping(value = "main", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String main(@org.springframework.web.bind.annotation.ModelAttribute(value = "model")
org.springframework.ui.ModelMap model) {
    return "main";
}