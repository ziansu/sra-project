@org.springframework.web.bind.annotation.RequestMapping(value = "/connectWithProvider")
public java.lang.String connect(java.util.Map model) {
    return "oauthconnect";
}