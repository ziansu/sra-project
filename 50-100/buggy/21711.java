@java.lang.Override
public eu.bcvsolutions.idm.core.api.event.EventResult<eu.bcvsolutions.idm.core.api.dto.IdmIdentityDto> process(eu.bcvsolutions.idm.core.api.event.EntityEvent<eu.bcvsolutions.idm.core.api.dto.IdmIdentityDto> event) {
    java.lang.Object skipProvisioning = event.getProperties().get(ProvisioningService.SKIP_PROVISIONING);
    if (((skipProvisioning != null) && (skipProvisioning instanceof java.lang.Boolean)) && ((java.lang.Boolean) (skipProvisioning))) {
        return new eu.bcvsolutions.idm.core.api.event.DefaultEventResult(event, this);
    }
    doProvisioning(identityRepository.findOne(event.getContent().getId()));
    return new eu.bcvsolutions.idm.core.api.event.DefaultEventResult(event, this);
}