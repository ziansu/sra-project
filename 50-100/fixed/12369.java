@org.springframework.web.bind.annotation.RequestMapping(value = "/module/radiology/radiologyOrder.form", method = org.springframework.web.bind.annotation.RequestMethod.GET)
protected org.springframework.web.servlet.ModelAndView getRadiologyOrderFormWithNewRadiologyOrder() {
    org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView("module/radiology/radiologyOrderForm");
    if (org.openmrs.api.context.Context.isAuthenticated()) {
        org.openmrs.module.radiology.RadiologyOrder radiologyOrder = new org.openmrs.module.radiology.RadiologyOrder();
        radiologyOrder.setStudy(new org.openmrs.module.radiology.Study());
        modelAndView.addObject("order", new org.openmrs.Order());
        modelAndView.addObject("isOrderActive", true);
        modelAndView.addObject("radiologyOrder", radiologyOrder);
    }
    return modelAndView;
}