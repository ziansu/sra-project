@java.lang.Override
public com.netflix.spinnaker.clouddriver.deploy.DeploymentResult operate(java.util.List priorOutputs) {
    updateTaskStatus("Initializing Create Amazon ECS Server Group Operation...");
    com.amazonaws.services.ecs.model.TaskDefinition taskDefinition = registerTaskDefinition();
    com.amazonaws.services.ecs.model.Service service = createService(taskDefinition);
    createAutoScalingGroup(service);
    return getDeploymentResult(service);
}