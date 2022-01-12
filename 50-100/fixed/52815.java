public void registerKanttype(org.iish.hsn.invoer.service.akte.GeboorteAkteFlowState geboorteAkteFlow) {
    org.iish.hsn.invoer.service.akte.Gebkant gebkant = geboorteAkteFlow.getGebkant();
    gebkant.setIdnr(geboorteAkteFlow.getGebknd().getIdnr());
    inputMetadata.saveToEntity(gebkant);
    gebkant = gebkantRepository.save(gebkant);
    geboorteAkteFlow.setGebkant(gebkant);
}