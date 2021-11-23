public void registerKanttype(org.iish.hsn.invoer.service.akte.GeboorteAkteFlowState geboorteAkteFlow) {
    org.iish.hsn.invoer.service.akte.Gebknd gebknd = geboorteAkteFlow.getGebknd();
    org.iish.hsn.invoer.service.akte.Gebkant gebkant = geboorteAkteFlow.getGebkant();
    gebkant.setIdnr(gebknd.getIdnr());
    if (!(geboorteAkteFlow.isCorrection())) {
        gebkant.setKhuwanr("N");
    }
    inputMetadata.saveToEntity(gebkant);
    gebkant = gebkantRepository.save(gebkant);
    geboorteAkteFlow.setGebkant(gebkant);
}