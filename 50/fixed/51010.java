@org.springframework.web.bind.annotation.ExceptionHandler(value = java.util.regex.PatternSyntaxException.class)
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.BAD_REQUEST)
ua.org.fits.entity.error.ErrorInfo handleRegexExeption(javax.servlet.http.HttpServletRequest req, java.util.regex.PatternSyntaxException ex) {
    return new ua.org.fits.entity.error.ErrorInfo(req.getRequestURI(), "regex is not true");
}