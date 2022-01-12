@com.wordnik.swagger.annotations.ApiOperation(value = "Remove a flavor from the given cloud", notes = "Only user with ADMIN role can add a cloud image.")
@org.springframework.web.bind.annotation.RequestMapping(value = "/{cloudId}/flavors/{flavorId}", method = org.springframework.web.bind.annotation.RequestMethod.DELETE, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public alien4cloud.rest.model.RestResponse<alien4cloud.rest.cloud.CloudComputeResourcesDTO> removeCloudImageFlavor(@org.springframework.web.bind.annotation.PathVariable
java.lang.String cloudId, @org.springframework.web.bind.annotation.PathVariable
java.lang.String flavorId) {
    alien4cloud.security.AuthorizationUtil.hasOneRoleIn(Role.ADMIN);
    alien4cloud.model.cloud.Cloud cloud = cloudService.getMandatoryCloud(cloudId);
    cloudService.removeCloudImageFlavor(cloud, flavorId);
    return alien4cloud.rest.model.RestResponseBuilder.<alien4cloud.rest.cloud.CloudComputeResourcesDTO>builder().data(new alien4cloud.rest.cloud.CloudComputeResourcesDTO(cloud.getComputeTemplates())).build();
}