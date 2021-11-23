@org.testng.annotations.Test(groups = "onDemand50")
public void testSetNoBoot() throws com.emc.cloud.platform.clientlib.ClientGeneralException {
    com.emc.cloud.platform.ucs.out.model.LsServer lsServer = ucsmService.setServiceProfileToNoBoot(com.emc.cloud.ucsm.service.UCSMServiceTest.UCSM_SERVICE3, com.emc.cloud.ucsm.service.UCSMServiceTest.UCSM_HOST3_USERNAME, com.emc.cloud.ucsm.service.UCSMServiceTest.UCSM_HOST3_PASSWORD, com.emc.cloud.ucsm.service.UCSMServiceTest.SP_DN);
    org.testng.Assert.assertNotNull(lsServer, ("Couldn't update the LsServer's boot order " + (com.emc.cloud.ucsm.service.UCSMServiceTest.SP_DN)));
    java.lang.System.out.println(("Current State of the lsServer : " + (lsServer.getOperState())));
}