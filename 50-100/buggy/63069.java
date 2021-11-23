public void validateUpdatedDescription(org.fiware.apps.marketplace.model.Description oldDescription, org.fiware.apps.marketplace.model.Description updatedDescription) throws org.fiware.apps.marketplace.exceptions.ValidationException {
    boolean checkExistingDisplayName = !(oldDescription.getDisplayName().equals(updatedDescription.getDisplayName()));
    boolean checkExistingURL = !(oldDescription.getUrl().equals(updatedDescription.getUrl()));
    this.validateDescription(updatedDescription, false, checkExistingDisplayName, checkExistingURL);
}