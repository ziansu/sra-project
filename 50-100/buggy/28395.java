@org.testng.annotations.Test
public void testActiveFeature() throws java.lang.InterruptedException {
    org.ats.services.organization.entity.Tenant tenant = tenantService.get("Fsoft");
    eventService.setListener(org.ats.services.organization.event.ActivationServiceTestCase.ActiveFeatureListener.class);
    activationService.inActiveFeature(tenant.getFeatures().get(1).get());
    activationService.activeFeature("performace");
}