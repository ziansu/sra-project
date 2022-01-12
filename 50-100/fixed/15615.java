protected gov.hhs.fha.nhinc.common.nhinccommon.AssertionType createAssertion() {
    gov.hhs.fha.nhinc.common.nhinccommon.AssertionType assertion = new gov.hhs.fha.nhinc.common.nhinccommon.AssertionType();
    gov.hhs.fha.nhinc.common.nhinccommon.UserType userType = new gov.hhs.fha.nhinc.common.nhinccommon.UserType();
    userType.setOrg(createHomeCommunityType());
    userType.setPersonName(createPersonNameType());
    userType.setRoleCoded(createRoleCodedCeType());
    userType.setUserName(USER_ID);
    assertion.setUserInfo(userType);
    return assertion;
}