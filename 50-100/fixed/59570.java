public static void validateCategory(io.reactivesw.model.Reference category) {
    if (((category == null) || (!(category.getTypeId().equals(ReferenceTypes.CATEGORY.getType())))) || (org.apache.commons.lang3.StringUtils.isBlank(category.getId()))) {
        io.reactivesw.product.infrastructure.validator.CategoryValidator.LOG.debug("Category reference is null.");
        throw new io.reactivesw.exception.ParametersException("Category Reference is Null.");
    }
}