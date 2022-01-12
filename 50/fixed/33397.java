@org.springframework.web.portlet.bind.annotation.ResourceMapping(value = "weatherFeed")
public org.springframework.web.portlet.ModelAndView getWeatherFeed(javax.portlet.PortletRequest request, javax.portlet.PortletResponse response) {
    return new org.springframework.web.portlet.ModelAndView("jsonView", getWeatherInfo(request, response));
}