@io.swagger.annotations.ApiOperation(value = "Substitute a specific node by the location resource template in the topology of an application given an environment.", notes = "Application role required [ APPLICATION_MANAGER | APPLICATION_DEVOPS ] and Application environment role required [ DEPLOYMENT_MANAGER ]")
@org.springframework.web.bind.annotation.RequestMapping(value = "/substitutions/{nodeId}", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.security.access.prepost.PreAuthorize(value = "isAuthenticated()")
@alien4cloud.audit.annotation.Audit
public alien4cloud.rest.model.RestResponse<alien4cloud.rest.deployment.DeploymentTopologyDTO> updateSubstitution(@org.springframework.web.bind.annotation.PathVariable
java.lang.String appId, @org.springframework.web.bind.annotation.PathVariable
java.lang.String environmentId, @org.springframework.web.bind.annotation.PathVariable
java.lang.String nodeId, @org.springframework.web.bind.annotation.RequestParam
java.lang.String locationResourceTemplateId) {
    checkAuthorizations(appId, environmentId);
    alien4cloud.deployment.model.DeploymentConfiguration deploymentConfiguration = deploymentTopologyService.updateSubstitution(environmentId, nodeId, locationResourceTemplateId);
    return alien4cloud.rest.model.RestResponseBuilder.<alien4cloud.rest.deployment.DeploymentTopologyDTO>builder().data(buildDeploymentTopologyDTO(deploymentConfiguration)).build();
}