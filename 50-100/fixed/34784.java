@org.testng.annotations.Test(groups = "onDemand6")
public void testDeleteServiceProfile() throws com.emc.cloud.platform.clientlib.ClientGeneralException, java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
    ucsmService.deleteServiceProfile(com.emc.cloud.ucsm.service.UCSMServiceTest.UCSM_SERVICE, com.emc.cloud.ucsm.service.UCSMServiceTest.UCSM_HOST_USERNAME, com.emc.cloud.ucsm.service.UCSMServiceTest.UCSM_HOST_PASSWORD, com.emc.cloud.ucsm.service.UCSMServiceTest.SP_DN3, new java.lang.StringBuilder());
    com.emc.cloud.platform.ucs.out.model.LsServer deletedServiceProfile = ucsmService.getManagedObject(com.emc.cloud.ucsm.service.UCSMServiceTest.UCSM_SERVICE, com.emc.cloud.ucsm.service.UCSMServiceTest.UCSM_HOST_USERNAME, com.emc.cloud.ucsm.service.UCSMServiceTest.UCSM_HOST_PASSWORD, com.emc.cloud.ucsm.service.UCSMServiceTest.SP_DN3, true, com.emc.cloud.platform.ucs.out.model.LsServer.class);
    org.testng.Assert.assertNull(deletedServiceProfile);
    java.lang.System.out.println((("Service Profile : " + (com.emc.cloud.ucsm.service.UCSMServiceTest.SP_DN3)) + " : DELETED"));
}