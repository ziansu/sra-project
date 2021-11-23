@org.junit.Test
public void testSendFeedback() {
    org.jboss.arquillian.graphene.Graphene.waitModel().until().element(feedbackButton).is().visible();
    feedbackButton.click();
    feedback.sendFeedback("graphene-test", cz.muni.proso.geography.test.EMAIL);
    org.junit.Assert.assertTrue(feedback.getAlertMsg().isSuccessAlert());
}