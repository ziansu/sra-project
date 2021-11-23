private java.lang.Boolean checkIsEligibleForDiscountOnPermitFee(final java.math.BigDecimal inputUnit, final java.lang.String serviceTypeCode) {
    if ((org.egov.bpa.utils.BpaConstants.getServicesForValidation().contains(serviceTypeCode)) && ((inputUnit.compareTo(java.math.BigDecimal.valueOf(150))) <= 0)) {
        return true;
    }
    return false;
}