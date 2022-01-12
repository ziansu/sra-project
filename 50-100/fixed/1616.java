@org.junit.Test
public void verifyDeleteService() throws java.lang.Exception {
    final org.apereo.cas.services.RegexRegisteredService r = new org.apereo.cas.services.RegexRegisteredService();
    r.setId(1200);
    r.setName(org.apereo.cas.services.web.ManageRegisteredServicesMultiActionControllerTests.NAME);
    r.setServiceId("serviceId");
    r.setEvaluationOrder(1);
    this.servicesManager.save(r);
    final org.springframework.mock.web.MockHttpServletResponse response = new org.springframework.mock.web.MockHttpServletResponse();
    this.controller.manage(response);
    this.controller.deleteRegisteredService(1200);
    assertNull(this.servicesManager.findServiceBy(1200));
}