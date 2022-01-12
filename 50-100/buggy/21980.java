private void setPrincipalInvestigator(com.krishagni.catissueplus.core.administrative.events.DistributionProtocolDetail detail, com.krishagni.catissueplus.core.administrative.domain.DistributionProtocol distributionProtocol, com.krishagni.catissueplus.core.common.errors.ObjectCreationException oce) {
    com.krishagni.catissueplus.core.administrative.domain.User pi = daoFactory.getUserDao().getUser(detail.getPrincipalInvestigator().getId());
    if (pi == null) {
        oce.addError(DistributionProtocolErrorCode.INVALID_PRINCIPAL_INVESTIGATOR, com.krishagni.catissueplus.core.administrative.domain.factory.impl.DistributionProtocolFactoryImpl.PRINCIPLE_INVESTIGATOR);
        return ;
    }
    distributionProtocol.setPrincipalInvestigator(pi);
}