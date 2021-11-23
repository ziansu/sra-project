@org.junit.Test
public void testJudgeMock() {
    owo.com.androidunittest.targets.A a = org.mockito.Mockito.mock(owo.com.androidunittest.targets.A.class);
    owo.com.androidunittest.targets.A b = org.mockito.Mockito.spy(new owo.com.androidunittest.targets.A());
    junit.framework.Assert.assertTrue(org.mockito.Mockito.mockingDetails(a).isMock());
    junit.framework.Assert.assertFalse(org.mockito.Mockito.mockingDetails(a).isSpy());
    junit.framework.Assert.assertTrue(org.mockito.Mockito.mockingDetails(b).isMock());
    junit.framework.Assert.assertTrue(org.mockito.Mockito.mockingDetails(b).isSpy());
}