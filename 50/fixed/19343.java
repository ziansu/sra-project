private void createUploadURLFields() {
    productionUploadURLTextField = createUploadURLField(Messages.PrefsFacade_ProductionUploadURLKey, Messages.UploadingPreferencePage_ProductionUploadURLTextField, Messages.AuthenticationPrompter_ProductionRepositoryURL);
    testUploadURLTextField = createUploadURLField(Messages.PrefsFacade_TestUploadURLKey, Messages.UploadingPreferencePage_TestUploadURLTextField, Messages.AuthenticationPrompter_TestRepositoryURL);
}