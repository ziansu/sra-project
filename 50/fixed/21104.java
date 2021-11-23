@com.sg.compliance.xborder.web.controller.PostMapping(value = "/{countryISO}")
@com.sg.compliance.xborder.web.controller.ResponseBody
public void addPolicy(@io.swagger.annotations.ApiParam(required = true)
@com.sg.compliance.xborder.web.controller.PathVariable(value = "countryISO")
java.lang.String countryISO, @com.sg.compliance.xborder.web.controller.RequestBody
com.sg.compliance.xborder.web.dto.PolicyDTO policyDTO) {
    com.sg.compliance.xborder.data.object.Policy policy = com.sg.compliance.xborder.web.transformer.PolicyTransformer.toDomain(policyDTO);
    policyManagementService.add(countryISO, policy);
}