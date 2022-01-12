@java.lang.Override
public eu.bcvsolutions.idm.core.api.event.EventResult<eu.bcvsolutions.idm.core.model.entity.IdmRole> process(eu.bcvsolutions.idm.core.api.event.EntityEvent<eu.bcvsolutions.idm.core.model.entity.IdmRole> event) {
    java.lang.Object breakProvisioning = event.getProperties().get(ProvisioningService.SKIP_PROVISIONING);
    if (((breakProvisioning != null) && (breakProvisioning instanceof java.lang.Boolean)) && ((java.lang.Boolean) (breakProvisioning))) {
        return new eu.bcvsolutions.idm.core.api.event.DefaultEventResult(event, this);
    }
    doProvisioning(event.getContent());
    return new eu.bcvsolutions.idm.core.api.event.DefaultEventResult(event, this);
}