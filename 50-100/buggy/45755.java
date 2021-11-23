@org.springframework.web.bind.annotation.ExceptionHandler(value = { org.springframework.security.access.AccessDeniedException.class })
public org.springframework.web.servlet.ModelAndView handleAccessDeniedException(org.springframework.security.access.AccessDeniedException ex) {
    if (pt.ist.socialsoftware.edition.controller.LdoDExceptionHandler.logger.isDebugEnabled()) {
        pt.ist.socialsoftware.edition.controller.LdoDExceptionHandler.logger.debug("AccessDeniedException: {}", ex.getMessage());
    }
    org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView();
    modelAndView.setViewName("utils/ldoDExceptionPage");
    modelAndView.addObject("i18n", true);
    modelAndView.addObject("message", "general.access.denied");
    return modelAndView;
}