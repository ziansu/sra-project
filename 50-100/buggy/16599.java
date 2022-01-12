@org.springframework.web.bind.annotation.RequestMapping(value = "manage.html", method = { org.springframework.web.bind.annotation.RequestMethod.GET })
public org.springframework.web.servlet.ModelAndView manage() {
    ensureDefaultServiceExists();
    final java.util.Map<java.lang.String, java.lang.Object> model = new java.util.HashMap<>();
    final java.util.List<org.jasig.cas.services.RegisteredService> services = new java.util.ArrayList(this.servicesManager.getAllServices());
    for (final org.jasig.cas.services.RegisteredService svc : services) {
        serviceBeans.add(org.jasig.cas.services.web.RegisteredServiceBean.fromRegisteredService(svc));
    }
    model.put("services", serviceBeans);
    return new org.springframework.web.servlet.ModelAndView("jsonView", model);
}