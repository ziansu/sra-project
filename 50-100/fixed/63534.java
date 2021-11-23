@io.swagger.annotations.ApiOperation(value = "Get the deployment topology of an application given an environment.", notes = "Application role required [ APPLICATION_MANAGER | APPLICATION_DEVOPS ] and Application environment role required [ DEPLOYMENT_MANAGER ]")
@org.springframework.web.bind.annotation.RequestMapping(value = "", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.security.access.prepost.PreAuthorize(value = "isAuthenticated()")
public alien4cloud.rest.model.RestResponse<alien4cloud.rest.deployment.DeploymentTopologyDTO> getDeploymentTopology(@org.springframework.web.bind.annotation.PathVariable
java.lang.String appId, @org.springframework.web.bind.annotation.PathVariable
java.lang.String environmentId) {
    checkAuthorizations(appId, environmentId);
    alien4cloud.deployment.model.DeploymentConfiguration deploymentConfiguration = deploymentTopologyService.getDeploymentConfiguration(environmentId);
    alien4cloud.rest.deployment.DeploymentTopologyDTO dto = buildDeploymentTopologyDTO(deploymentConfiguration);
    return alien4cloud.rest.model.RestResponseBuilder.<alien4cloud.rest.deployment.DeploymentTopologyDTO>builder().data(dto).build();
}