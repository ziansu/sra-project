@java.lang.Override
public org.shaolin.vogerp.commonmodel.be.ILegalOrganizationInfo getLegalInfo(long orgId) {
    if (orgId <= 0) {
        return null;
    }
    org.shaolin.vogerp.commonmodel.be.LegalOrganizationInfoImpl scFlow = new org.shaolin.vogerp.commonmodel.be.LegalOrganizationInfoImpl();
    scFlow.setOrgId(orgId);
    java.util.List<org.shaolin.vogerp.commonmodel.be.ILegalOrganizationInfo> list = CommonModel.INSTANCE.searchOrgaLegalInfo(scFlow, null, 0, (-1));
    if ((list.size()) > 0) {
        return list.get(0);
    }
    return null;
}