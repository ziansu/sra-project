@org.junit.Test
public void testValidateAlreadyUsedCode() {
    org.hni.security.om.ActivationCode code = activationCodeService.getByActivationCode(org.hni.security.service.TestActivationCodeService.SUPPLIED_AUTH_CODE_1);
    assertTrue(activationCodeService.validate(org.hni.security.service.TestActivationCodeService.SUPPLIED_AUTH_CODE_1));
    code.setUser(organizationUserService.get(1L));
    activationCodeService.update(code);
    assertFalse(activationCodeService.validate(org.hni.security.service.TestActivationCodeService.SUPPLIED_AUTH_CODE_1));
}