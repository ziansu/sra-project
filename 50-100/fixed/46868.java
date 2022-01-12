@org.springframework.web.bind.annotation.ExceptionHandler(value = { java.lang.Exception.class })
public org.springframework.web.servlet.ModelAndView handleException(java.lang.Exception ex) {
    pt.ist.socialsoftware.edition.controller.LdoDExceptionHandler.logger.error("Exception: {}", ex.getMessage(), ex);
    org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView();
    modelAndView.setViewName("utils/ldoDExceptionPage");
    modelAndView.addObject("message", ex.getMessage());
    return modelAndView;
}