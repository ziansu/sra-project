public java.util.Optional<com.qcadoo.model.api.Entity> getMainAddress(final com.qcadoo.model.api.Entity company) {
    if ((company.getId()) != null) {
        java.lang.String addressType = getMainAddressType();
        if (org.apache.commons.lang3.StringUtils.isNotEmpty(addressType)) {
            return java.util.Optional.ofNullable(findMainAddress(company, addressType));
        }
    }
    return java.util.Optional.empty();
}