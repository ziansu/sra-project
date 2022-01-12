private void registerAndSaveRegistrationAddresses(org.iish.hsn.invoer.service.akte.BevolkingsregisterFlowState bevolkingsregisterFlow) {
    registerRegistrationAddresses(bevolkingsregisterFlow);
    java.util.List<org.iish.hsn.invoer.service.akte.RegistrationAddress> b6 = bevolkingsregisterFlow.getB6();
    for (org.iish.hsn.invoer.service.akte.RegistrationAddress registrationAddress : b6) {
        inputMetadata.saveToEntity(registrationAddress);
    }
    b6 = registrationAddressRepository.save(b6);
    bevolkingsregisterFlow.setB6(b6);
}