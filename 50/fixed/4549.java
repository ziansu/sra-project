@org.testng.annotations.Test
public void anonymousConfirmationPage() throws java.lang.Exception {
    init();
    uitestOperation.buyManTshirtsWithAnonymousUser();
    uitestOperation.AnonymousCheckOut(userHybris, billing);
    orderNumber = uitestOperation.getOrderNumber();
    junit.framework.Assert.assertTrue(uitestOperation.verifyConfirmationPage());
}