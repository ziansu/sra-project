@java.lang.Override
protected void configure() {
    bindListener(com.google.inject.matcher.Matchers.any(), count1, new com.google.inject.ProvisionListenerTest.FailAfterProvision(), count2);
}