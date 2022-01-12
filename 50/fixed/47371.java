@org.springframework.web.bind.annotation.GetMapping(value = { "/" , "/home" })
java.lang.String index(java.security.Principal principal) {
    return principal != null ? "home/homeSignedIn" : "home/homeNotSignedIn";
}