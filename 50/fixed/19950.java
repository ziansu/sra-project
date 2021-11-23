@java.lang.Override
public void applyRelationships(org.orienteer.core.util.OSchemaHelper helper) {
    super.applyRelationships(helper);
    helper.setupRelationship(org.orienteer.bpm.camunda.handler.ByteArrayEntityHandler.OCLASS_NAME, "deployment", DeploymentEntityHandler.OCLASS_NAME);
}