private void addDescriptionValidationErrors(org.egov.pgrrest.read.domain.model.ServiceRequest model, java.util.List<org.egov.common.contract.response.ErrorField> errorFields) {
    if (model.isDescriptionAbsent()) {
        final org.egov.common.contract.response.ErrorField errorField = org.egov.common.contract.response.ErrorField.builder().code(org.egov.pgrrest.read.domain.service.validator.ServiceRequestFieldValidator.MANDATORY_DESCRIPTION_CODE).message(org.egov.pgrrest.read.domain.service.validator.ServiceRequestFieldValidator.DESCRIPTION_MANDATORY_MESSAGE).field(org.egov.pgrrest.read.domain.service.validator.ServiceRequestFieldValidator.MANDATORY_DESCRIPTION_FIELD_NAME).build();
        errorFields.add(errorField);
    }else {
        addDescriptionLengthValidationErrors(model, errorFields);
    }
}