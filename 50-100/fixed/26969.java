public void run() throws java.lang.Exception {
    org.cloudfoundry.identity.uaa.scim.validate.UaaPasswordPolicyValidator validator = applicationContext.getBean(org.cloudfoundry.identity.uaa.scim.validate.UaaPasswordPolicyValidator.class);
    org.cloudfoundry.identity.uaa.scim.validate.PasswordPolicyResolver resolver = org.mockito.Mockito.mock(org.cloudfoundry.identity.uaa.scim.validate.PasswordPolicyResolver.class);
    org.mockito.Mockito.when(resolver.resolve()).thenReturn(new org.cloudfoundry.identity.uaa.config.PasswordPolicy(6, 128, 1, 1, 1, 0, 0));
    try {
        validator.setPasswordPolicyResolver(resolver);
        methodToRun();
    } finally {
        validator.setPasswordPolicyResolver(applicationContext.getBean(org.cloudfoundry.identity.uaa.scim.validate.UaaPasswordPolicyResolver.class));
    }
}