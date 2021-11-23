@org.springframework.web.portlet.bind.annotation.ResourceMapping(value = "weatherFeed")
public org.springframework.web.portlet.ModelAndView getWeatherFeed(javax.portlet.PortletRequest request, javax.portlet.PortletResponse response, org.springframework.ui.ModelMap modelMap) {
    return new org.springframework.web.portlet.ModelAndView("jsonView", getWeatherInfo(request, response));
}