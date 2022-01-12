@org.springframework.web.bind.annotation.GetMapping(value = "/admin")
@org.springframework.security.access.prepost.PreAuthorize(value = "hasAuthority('ADMIN')")
public java.lang.String admin(java.security.Principal principal) {
    return "executed admin task for " + (principal.getName());
}