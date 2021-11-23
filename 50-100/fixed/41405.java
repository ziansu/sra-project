@org.testng.annotations.Test(groups = "onDemand", dependsOnMethods = "testCreateServiceProfileFromTemplate")
public void testBindServiceProfileToCE() throws com.emc.cloud.platform.clientlib.ClientGeneralException, java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
    createdServiceProfile = ucsmService.bindSPToComputeElement(com.emc.cloud.ucsm.service.UCSMServiceTest.UCSM_SERVICE2, com.emc.cloud.ucsm.service.UCSMServiceTest.UCSM_HOST2_USERNAME, com.emc.cloud.ucsm.service.UCSMServiceTest.UCSM_HOST2_PASSWORD, createdServiceProfile.getDn(), com.emc.cloud.ucsm.service.UCSMServiceTest.SP_DN4, new java.lang.StringBuilder());
    org.testng.Assert.assertNotNull(createdServiceProfile, "Created Service Profile should not be null...");
    org.testng.Assert.assertNotNull(createdServiceProfile.getDn(), "DN of Created Service Profile Should not be null...");
    org.testng.Assert.assertNotNull(createdServiceProfile.getUuid(), "UUID of the associated Service Profile should not be null!");
}