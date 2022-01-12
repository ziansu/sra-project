@org.springframework.web.bind.annotation.ExceptionHandler(value = { pt.ist.socialsoftware.edition.shared.exception.LdoDLoadException.class })
public org.springframework.web.servlet.ModelAndView handleLdoDLoadException(pt.ist.socialsoftware.edition.shared.exception.LdoDLoadException ex) {
    if (pt.ist.socialsoftware.edition.controller.LdoDExceptionHandler.logger.isDebugEnabled()) {
        pt.ist.socialsoftware.edition.controller.LdoDExceptionHandler.logger.debug("LdoDLoadException: {}", ex.getMessage());
    }
    org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView();
    modelAndView.setViewName("utils/ldoDExceptionPage");
    modelAndView.addObject("message", ex.getMessage());
    return modelAndView;
}