@org.springframework.web.bind.annotation.ExceptionHandler(value = java.lang.IllegalArgumentException.class)
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.BAD_REQUEST)
ua.org.fits.entity.error.ErrorInfo handleillegalStateExeption(javax.servlet.http.HttpServletRequest req, java.lang.IllegalArgumentException ex) {
    return new ua.org.fits.entity.error.ErrorInfo(req.getRequestURI(), ex.getLocalizedMessage());
}