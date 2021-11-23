public void registerAndSaveRegistration(org.iish.hsn.invoer.service.akte.BevolkingsregisterFlowState bevolkingsregisterFlow) {
    org.iish.hsn.invoer.service.akte.Registration b4 = bevolkingsregisterFlow.getB4();
    inputMetadata.saveToEntity(b4);
    b4 = registrationRepository.save(b4);
    bevolkingsregisterFlow.setB4(b4);
}