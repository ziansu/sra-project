@org.springframework.web.bind.annotation.RequestMapping(value = "/error500")
public com.core.domain.Message error500(javax.servlet.http.HttpServletRequest request) {
    java.lang.String message = "Access denied";
    com.core.exceptions.AuthException authException = ((com.core.exceptions.AuthException) (request.getAttribute("javax.servlet.error.exception")));
    if (authException != null)
        message = authException.getMessage();
    
    return new com.core.domain.Message(message, 500);
}