@org.springframework.security.access.annotation.Secured(value = "ROLE_ADMIN")
@org.springframework.web.bind.annotation.RequestMapping(value = "/")
public java.lang.String welcome(java.util.Map<java.lang.String, java.lang.Object> model) {
    model.put("time", new java.util.Date());
    return "welcome";
}