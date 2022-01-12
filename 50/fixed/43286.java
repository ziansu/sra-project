@org.springframework.web.bind.annotation.RequestMapping(value = "login")
public java.lang.String getLogin() {
    if (org.apache.shiro.SecurityUtils.getSubject().isAuthenticated()) {
        return "index";
    }else {
        return "login";
    }
}