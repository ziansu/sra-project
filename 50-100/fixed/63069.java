public void validateUpdatedDescription(org.fiware.apps.marketplace.model.Description oldDescription, org.fiware.apps.marketplace.model.Description updatedDescription) throws org.fiware.apps.marketplace.exceptions.ValidationException {
    boolean checkExistingDisplayName = !(oldDescription.getDisplayName().toLowerCase().equals(updatedDescription.getDisplayName().toLowerCase()));
    boolean checkExistingURL = !(oldDescription.getUrl().toLowerCase().equals(updatedDescription.getUrl().toLowerCase()));
    this.validateDescription(updatedDescription, false, checkExistingDisplayName, checkExistingURL);
}