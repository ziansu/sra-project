public void deleteByReferenceId(long referenceId) throws com.liferay.portal.kernel.exception.PortalException {
    java.util.List<ch.inofix.referencemanager.model.RefRefRelation> refRefRelations = refRefRelationPersistence.findByReferenceId1(referenceId);
    refRefRelations.addAll(refRefRelationPersistence.findByReferenceId2(referenceId));
    for (ch.inofix.referencemanager.model.RefRefRelation refRefRelation : refRefRelations) {
        refRefRelationLocalService.deleteRefRefRelation(refRefRelation);
    }
}