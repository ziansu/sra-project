@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.View redirect(@org.springframework.web.bind.annotation.RequestParam(value = "url")
java.lang.String url) {
    return new org.springframework.web.servlet.view.RedirectView(url);
}