private boolean isValidCandidate(alien4cloud.model.topology.NodeTemplate nodeTemplate, alien4cloud.deployment.matching.services.nodes.IndexedNodeType nodeType, alien4cloud.model.orchestrators.locations.LocationResourceTemplate candidate, alien4cloud.deployment.matching.services.nodes.IndexedNodeType candidateType, java.util.Map<java.lang.String, alien4cloud.deployment.matching.services.nodes.IndexedCapabilityType> capabilityTypes, java.util.Map<java.lang.String, alien4cloud.model.deployment.matching.MatchingConfiguration> matchingConfigurations) {
    if (!(isCandidateTypeValid(nodeTemplate, candidate, candidateType))) {
        return false;
    }
    alien4cloud.model.deployment.matching.MatchingConfiguration matchingConfiguration = matchingConfigurations.get(nodeType.getElementId());
    if (matchingConfiguration == null) {
        return true;
    }
    return isTemplatePropertiesMatchCandidateFilters(nodeTemplate, matchingConfiguration, candidate, candidateType, capabilityTypes);
}