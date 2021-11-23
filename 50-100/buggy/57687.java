@io.swagger.annotations.ApiOperation(value = "Substitute a specific node by the location resource template in the topology of an application given an environment.", notes = "Application role required [ APPLICATION_MANAGER | APPLICATION_DEVOPS ] and Application environment role required [ DEPLOYMENT_MANAGER ]")
@alien4cloud.rest.deployment.RequestMapping(value = "/substitutions/{nodeId}", method = RequestMethod.POST)
@org.springframework.security.access.prepost.PreAuthorize(value = "isAuthenticated()")
@alien4cloud.audit.annotation.Audit
public alien4cloud.rest.model.RestResponse<alien4cloud.rest.deployment.DeploymentTopologyDTO> updateSubstitution(@alien4cloud.rest.deployment.PathVariable
java.lang.String appId, @alien4cloud.rest.deployment.PathVariable
java.lang.String environmentId, @alien4cloud.rest.deployment.PathVariable
java.lang.String nodeId, @alien4cloud.rest.deployment.RequestParam
java.lang.String locationResourceTemplateId) {
    checkAuthorizations(appId, environmentId);
    alien4cloud.deployment.model.DeploymentConfiguration deploymentConfiguration = deploymentTopologyService.getDeploymentConfiguration(environmentId);
    alien4cloud.model.deployment.DeploymentTopology deploymentTopology = deploymentConfiguration.getDeploymentTopology();
    locationResourceService.getOrFail(locationResourceTemplateId);
    deploymentTopology.getSubstitutedNodes().put(nodeId, locationResourceTemplateId);
    deploymentTopologyService.updateDeploymentTopology(deploymentTopology);
    return alien4cloud.rest.model.RestResponseBuilder.<alien4cloud.rest.deployment.DeploymentTopologyDTO>builder().data(buildDeploymentTopologyDTO(deploymentConfiguration)).build();
}