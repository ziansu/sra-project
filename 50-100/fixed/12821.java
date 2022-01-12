@java.lang.Override
public boolean canHandle(org.opentosca.planbuilder.model.tosca.AbstractImplementationArtifact ia, org.opentosca.planbuilder.model.tosca.AbstractNodeType infrastructureNodeType) {
    javax.xml.namespace.QName type = ia.getArtifactType();
    org.opentosca.planbuilder.prephase.plugin.scriptiaonlinux.PrePhasePlugin.LOG.debug((((("Checking if type: " + (type.toString())) + " and infrastructure nodeType: ") + (infrastructureNodeType.getId().toString())) + " can be handled"));
    return this.isSupportedDeploymentPair(type, infrastructureNodeType.getId(), false);
}