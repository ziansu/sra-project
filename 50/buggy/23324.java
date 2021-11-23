@org.springframework.web.bind.annotation.ExceptionHandler(value = java.lang.IllegalArgumentException.class)
@org.springframework.web.bind.annotation.ResponseBody
org.springframework.http.ResponseEntity<ua.org.fits.entity.error.ErrorInfo> handleillegalStateExeption(javax.servlet.http.HttpServletRequest req, java.lang.IllegalArgumentException ex) {
    return org.springframework.http.ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ua.org.fits.entity.error.ErrorInfo(req.getRequestURI(), ex.getLocalizedMessage()));
}