@org.springframework.web.bind.annotation.RequestMapping(value = "/property/assessmentdetails", method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = javax.ws.rs.core.MediaType.APPLICATION_JSON, produces = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.lang.String fetchAssessmentDetails(@org.springframework.web.bind.annotation.RequestBody
java.lang.String assessmentRequest) throws java.io.IOException, org.codehaus.jackson.JsonGenerationException, org.codehaus.jackson.map.JsonMappingException {
    org.egov.restapi.model.AssessmentRequest assessmentReq = ((org.egov.restapi.model.AssessmentRequest) (getObjectFromJSONRequest(assessmentRequest, org.egov.restapi.model.AssessmentRequest.class)));
    java.lang.String responseJson = new java.lang.String();
    org.egov.ptis.domain.model.ErrorDetails errorDetails = validationUtil.validateAssessmentDetailsRequest(assessmentReq);
    if (errorDetails != null) {
        responseJson = getJSONResponse(errorDetails);
    }else {
        org.egov.ptis.domain.model.RestAssessmentDetails assessmentDetails = propertyExternalService.fetchAssessmentDetails(assessmentReq.getAssessmentNo());
        responseJson = getJSONResponse(assessmentDetails);
    }
    return responseJson;
}