@org.junit.Test
public void registration() {
    junit.framework.TestCase.assertNull(getLogin("mike", "123").exec());
    org.flockdata.test.integration.SystemUserResultBean suResult = getDefaultUser();
    junit.framework.TestCase.assertNotNull(suResult);
    junit.framework.TestCase.assertNotNull(suResult.getApiKey());
}