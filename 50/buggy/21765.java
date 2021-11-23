@org.springframework.web.bind.annotation.RequestMapping(value = "/user/index.action")
public java.lang.String UserIndexNavigate(@org.springframework.web.bind.annotation.PathVariable(value = "page")
java.lang.String page) {
    return "/user/index";
}