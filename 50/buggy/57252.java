@java.lang.Override
public org.springframework.cloud.dataflow.rest.resource.AppInstanceStatusResource toResource(org.springframework.cloud.deployer.spi.app.AppInstanceStatus entity) {
    return createResourceWithId(("/" + (entity.getId())), entity, owningApp.getDeploymentId().toString());
}