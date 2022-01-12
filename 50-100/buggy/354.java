@org.springframework.web.bind.annotation.GetMapping(value = "/login")
public java.lang.String login(@org.springframework.web.bind.annotation.RequestParam
java.util.Map<java.lang.String, java.lang.String> requestParams) {
    java.lang.String username = requestParams.get("user");
    java.lang.String password = requestParams.get("password");
    if ((((username != null) && (password != null)) && (username.equals("potatis"))) && (password.equals("kakor")))
        PortCDMRequest = $missing$;
    
    req = new softproject.services.PortCDMRequest();
    req.subscribe();
    return "index";
    return "login";
}