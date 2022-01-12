private static java.lang.String getErrorMessage(javax.servlet.http.HttpServletRequest request, java.lang.String key) {
    java.lang.Exception exception = ((java.lang.Exception) (request.getSession().getAttribute(key)));
    java.lang.String error;
    if (exception instanceof org.springframework.security.authentication.BadCredentialsException) {
        error = "Invalid username or password";
    }else {
        error = "Some error occured. Please contact administrator";
    }
    return error;
}