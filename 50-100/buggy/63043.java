@com.wordnik.swagger.annotations.ApiOperation(value = "Retrieve a topology from it's id.", notes = "Returns a topology with it's details. Application role required [ APPLICATION_MANAGER | APPLICATION_DEVOPS ]")
@org.springframework.web.bind.annotation.RequestMapping(value = "/{topologyId}", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
@org.springframework.security.access.prepost.PreAuthorize(value = "isAuthenticated()")
public alien4cloud.rest.model.RestResponse<alien4cloud.topology.TopologyDTO> get(@org.springframework.web.bind.annotation.PathVariable
java.lang.String topologyId) {
    alien4cloud.model.topology.Topology topology = topologyServiceCore.getMandatoryTopology(topologyId);
    topologyService.checkAuthorizations(topology, ApplicationRole.APPLICATION_MANAGER, ApplicationRole.APPLICATION_DEVOPS, ApplicationRole.APPLICATION_USER);
    workflowBuilderService.initWorkflows(workflowBuilderService.buildTopologyContext(topology));
    return alien4cloud.rest.model.RestResponseBuilder.<alien4cloud.topology.TopologyDTO>builder().data(topologyService.buildTopologyDTO(topology)).build();
}