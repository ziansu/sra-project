public java.util.List<com.ext.portlet.model.Proposal2Phase> getByContestPhaseId(long contestPhaseId) throws java.lang.Exception {
    final com.liferay.portal.kernel.dao.orm.DynamicQuery contestPhasesByContestPhaseId = com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil.forClass(com.ext.portlet.model.Proposal2Phase.class, "phaseProposalIds");
    contestPhasesByContestPhaseId.setProjection(com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil.property("phaseProposalIds.primaryKey.proposalId"));
    contestPhasesByContestPhaseId.add(com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil.forName("phaseProposalIds.primaryKey.contestPhaseId").eq(contestPhaseId));
    return dynamicQuery(contestPhasesByContestPhaseId);
}