@org.junit.Test
public void testName() throws java.lang.Exception {
    webhook = webhook.withDefaults(true);
    webhookValidator.validate(webhook.withName("aA9_-"));
}