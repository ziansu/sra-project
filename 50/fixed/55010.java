private org.springframework.web.servlet.ModelAndView redirectToIndex() {
    this.log.trace("Redirecting to index");
    return new org.springframework.web.servlet.ModelAndView(new org.springframework.web.servlet.view.RedirectView("/dataproviders/", true));
}