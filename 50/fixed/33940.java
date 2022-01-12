@org.junit.Test
public void testCreateNewPlan() throws java.lang.Exception {
    com.springfullstackcloudapp.backend.persistence.domains.backend.Plan basicPlan = createplan(PlansEnum.BASIC);
    planRepository.save(basicPlan);
    com.springfullstackcloudapp.backend.persistence.domains.backend.Plan retrievedPlan = planRepository.findOne(PlansEnum.BASIC.getId());
    org.junit.Assert.assertNotNull(retrievedPlan);
}