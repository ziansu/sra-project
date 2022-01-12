private void addEmailLengthValidationErrors(org.egov.pgrrest.read.domain.model.ServiceRequest model, java.util.List<org.egov.common.contract.response.ErrorField> errorFields) {
    if (!(model.emailLength())) {
        return ;
    }
    final org.egov.common.contract.response.ErrorField errorField = org.egov.common.contract.response.ErrorField.builder().code(org.egov.pgrrest.read.domain.service.validator.ServiceRequestFieldValidator.EMAIL_LENGTH_CODE).message(org.egov.pgrrest.read.domain.service.validator.ServiceRequestFieldValidator.EMAIL_LENGTH_MESSAGE).field(org.egov.pgrrest.read.domain.service.validator.ServiceRequestFieldValidator.EMAIL_LENGTH_FIELD).build();
    errorFields.add(errorField);
}