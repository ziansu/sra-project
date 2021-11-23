public void validateUpdatedUser(org.fiware.apps.marketplace.model.User oldUser, org.fiware.apps.marketplace.model.User updatedUser) throws org.fiware.apps.marketplace.exceptions.ValidationException {
    validateUser(updatedUser, false, (!(oldUser.getEmail().equals(updatedUser.getEmail()))));
}