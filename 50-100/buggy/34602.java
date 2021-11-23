public synchronized void importNewArchive(org.alien4cloud.tosca.model.Csar csar, org.alien4cloud.tosca.model.templates.Topology topology) {
    ensureUniqueness(csar.getName(), csar.getVersion());
    workflowBuilderService.initWorkflows(workflowBuilderService.buildTopologyContext(topology));
    csarService.save(csar);
    topologyServiceCore.save(topology);
    if ((csar.getYamlFilePath()) == null) {
        csar.setYamlFilePath("topology.yml");
    }
    java.lang.String yaml = exportService.getYaml(csar, topology);
    archiveRepositry.storeCSAR(csar, yaml);
}