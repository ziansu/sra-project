@com.sg.compliance.xborder.web.controller.PostMapping(value = "/{countryISO}", consumes = { org.springframework.http.MediaType.APPLICATION_OCTET_STREAM_VALUE , org.springframework.http.MediaType.MULTIPART_FORM_DATA_VALUE , org.springframework.http.MediaType.ALL_VALUE })
@com.sg.compliance.xborder.web.controller.ResponseBody
public void addPolicy(@javax.websocket.server.PathParam(value = "countryISO")
java.lang.String countryISO, @com.sg.compliance.xborder.web.controller.RequestPart
com.sg.compliance.xborder.web.dto.PolicyDTO policyDTO, @com.sg.compliance.xborder.web.controller.RequestPart(value = "document")
org.springframework.web.multipart.MultipartFile policyDocument) {
    com.sg.compliance.xborder.data.object.Policy policy = com.sg.compliance.xborder.web.transformer.PolicyTransformer.toDomain(policyDTO);
    policy.setPolicyDocument(policyDocument);
    policyManagementService.add(countryISO, policy);
}