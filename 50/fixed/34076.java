public java.util.List<com.resman.common.Errors> getErrors() {
    com.resman.service.resource.ResourceTypeValidator.LOGGER.debug("get error list");
    try {
        return errors;
    } finally {
        errors = new java.util.ArrayList<>();
    }
}