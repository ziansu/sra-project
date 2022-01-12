@org.testng.annotations.Test(groups = "onDemand")
public void testCreateServiceProfileFromTemplate() throws com.emc.cloud.platform.clientlib.ClientGeneralException, java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
    createdServiceProfile = ucsmService.createServiceProfileFromTemplate(com.emc.cloud.ucsm.service.UCSMServiceTest.UCSM_SERVICE2, com.emc.cloud.ucsm.service.UCSMServiceTest.UCSM_HOST2_USERNAME, com.emc.cloud.ucsm.service.UCSMServiceTest.UCSM_HOST2_PASSWORD, com.emc.cloud.ucsm.service.UCSMServiceTest.SP_DN2, "test-sp-janardhan", new java.lang.StringBuffer());
    org.testng.Assert.assertNotNull(createdServiceProfile, "Created Service Profile should not be null...");
    org.testng.Assert.assertNotNull(createdServiceProfile, "DN of Created Service Profile Should not be null...");
}