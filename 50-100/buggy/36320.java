public org.egov.ptis.domain.model.ErrorDetails validateAssessmentDetailsRequest(org.egov.restapi.model.AssessmentRequest assessmentRequest) {
    org.egov.ptis.domain.model.ErrorDetails errorDetails = null;
    if (!(basicPropertyDAO.isAssessmentNoExist(assessmentRequest.getAssessmentNo()))) {
        errorDetails = new org.egov.ptis.domain.model.ErrorDetails();
        errorDetails.setErrorCode(PropertyTaxConstants.THIRD_PARTY_ERR_CODE_ASSESSMENT_NO_NOT_FOUND);
        errorDetails.setErrorMessage(PropertyTaxConstants.THIRD_PARTY_ERR_MSG_ASSESSMENT_NO_NOT_FOUND);
    }
    org.egov.ptis.domain.entity.property.PropertyMutation propertyMutation = propertyExternalService.getLatestPropertyMutationByAssesmentNo(assessmentRequest.getAssessmentNo());
    if (propertyMutation == null) {
        errorDetails = new org.egov.ptis.domain.model.ErrorDetails();
        errorDetails.setErrorCode(PropertyTaxConstants.THIRD_PARTY_ERR_CODE_MUTATION_INVALID);
        errorDetails.setErrorMessage(PropertyTaxConstants.THIRD_PARTY_ERR_MSG_MUTATION_INVALID);
    }
    return errorDetails;
}