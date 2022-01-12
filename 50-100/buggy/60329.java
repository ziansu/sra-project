@java.lang.Override
public java.lang.String getAddressValidationMessageIfCheckPayment(java.lang.String employeeId) {
    java.lang.String validationMessage = org.apache.commons.lang.StringUtils.EMPTY;
    if (isPayeeSignedUpForACH(employeeId)) {
        edu.cornell.kfs.concur.batch.service.impl.ConcurEmployeeInfoValidationServiceImpl.LOG.info((("validateAddressIfCheckPayment, the employee ID " + employeeId) + " is signed up for ACH so no need to validdate address."));
    }else {
        boolean valid = validPdpAddress(employeeId);
        validationMessage = getConfigurationService().getPropertyValueAsString(ConcurKeyConstants.CONCUR_INCOMPLETE_ADDRESS);
    }
    return validationMessage;
}