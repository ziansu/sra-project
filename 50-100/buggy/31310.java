@org.junit.BeforeClass
public static void beforeClass() throws yukihane.dq10don.exception.HappyServiceException {
    yukihane.dq10don.communication.utils.HttpUtil util = new yukihane.dq10don.communication.utils.HttpUtil();
    yukihane.dq10don.communication.HappyServiceTest.service = yukihane.dq10don.communication.HappyServiceFactory.getService(util.getSessionId());
    yukihane.dq10don.communication.dto.CharaSelectDto sel = yukihane.dq10don.communication.HappyServiceTest.service.characterSelect(util.getLoginInfo().getCharacterList().get(0).getWebPcNo());
    org.junit.Assert.assertEquals(0, sel.getResultCode());
}