@org.springframework.web.bind.annotation.RequestMapping(value = "/query")
public java.lang.String query(javax.servlet.http.HttpServletRequest request, @org.springframework.web.bind.annotation.RequestParam
java.lang.String foo) {
    return ((request.getRequestURI()) + "?foo=") + foo;
}