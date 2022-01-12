public void reset() {
    org.cloudml.deployer2.dsl.util.ActivityBuilder.setActivity(null);
    org.cloudml.deployer2.workflow.util.ActivityDiagram.alreadyDeployed = new org.cloudml.core.collections.ComponentInstanceGroup<org.cloudml.deployer2.workflow.util.ComponentInstance<? extends org.cloudml.deployer2.workflow.util.Component>>();
    alreadyStarted = new org.cloudml.core.collections.ComponentInstanceGroup<org.cloudml.deployer2.workflow.util.ComponentInstance<? extends org.cloudml.deployer2.workflow.util.Component>>();
    setCurrentModel(null);
}