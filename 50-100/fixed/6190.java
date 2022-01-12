@java.lang.Override
public long getOrgIdByPartyId(long partyId) {
    if (partyId <= 0) {
        throw new java.lang.IllegalArgumentException(("User id isn't correct: " + partyId));
    }
    org.shaolin.vogerp.commonmodel.be.PersonalInfoImpl condition = new org.shaolin.vogerp.commonmodel.be.PersonalInfoImpl();
    condition.setId(partyId);
    java.util.List<org.shaolin.vogerp.commonmodel.be.IPersonalInfo> result = CommonModel.INSTANCE.searchPersonInfo(condition, null, 0, 1);
    if ((result.size()) > 0) {
        return result.get(0).getOrgId();
    }
    throw new java.lang.IllegalArgumentException(("User id isn't correct: " + partyId));
}