public void isUniqueNodeTemplateName(java.lang.String topologyId, java.lang.String newNodeTemplateName, java.util.Map<java.lang.String, alien4cloud.topology.NodeTemplate> nodeTemplates) {
    if (nodeTemplates.containsKey(newNodeTemplateName.toLowerCase())) {
        log.debug("Add Node Template <{}> impossible (already exists)", newNodeTemplateName);
        throw new alien4cloud.exception.AlreadyExistException((((("A node template with the given name " + newNodeTemplateName) + " already exists in the topology ") + topologyId) + "."));
    }
}