private void validateId(java.lang.String id) throws logistics.utilities.exceptions.NullParameterException {
    if ((id == null) | (id.isEmpty())) {
        throw new logistics.utilities.exceptions.NullParameterException("Item ID cannot be null or empty");
    }
}