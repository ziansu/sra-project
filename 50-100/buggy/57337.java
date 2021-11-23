@org.springframework.transaction.annotation.Transactional(readOnly = true)
public void setEntityIdentifiers(biocode.fims.digester.Mapping mapping, java.lang.String expeditionCode, int projectId) {
    biocode.fims.service.Expedition expedition = getExpedition(expeditionCode, projectId);
    java.util.List<biocode.fims.entities.Bcid> expeditionEntityBcids = bcidService.getEntityBcids(expedition.getExpeditionId());
    for (biocode.fims.entities.Bcid bcid : expeditionEntityBcids) {
        for (biocode.fims.digester.Entity entity : mapping.getEntities()) {
            if (bcid.getTitle().equals(entity.getConceptAlias())) {
                entity.setIdentifier(bcid.getIdentifier());
            }
        }
    }
}