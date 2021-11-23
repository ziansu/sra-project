private static org.springframework.web.servlet.ModelAndView getErrorPage(java.lang.Exception exception, org.springframework.http.HttpStatus httpStatus) {
    org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView(org.synyx.urlaubsverwaltung.web.ExceptionHandlerControllerAdvice.ERROR_PAGE_NAME);
    modelAndView.addObject("exception", exception);
    modelAndView.addObject("statusCode", httpStatus.value());
    return modelAndView;
}