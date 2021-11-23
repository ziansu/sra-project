@com.wegas.core.rest.GET
@com.wegas.core.rest.Path(value = "{variableInstanceId: [1-9][0-9]*}")
public com.wegas.core.persistence.variable.VariableInstance get(@com.wegas.core.rest.PathParam(value = "variableDescriptorId")
java.lang.Long variableDescriptorId, @com.wegas.core.rest.PathParam(value = "variableInstanceId")
java.lang.Long variableInstanceId) {
    com.wegas.core.persistence.variable.VariableInstance vi = variableInstanceFacade.find(variableInstanceId);
    org.apache.shiro.SecurityUtils.getSubject().checkPermission(("GameModel:View:gm" + (vi.getDescriptor().getGameModelId())));
    if ((variableDescriptorId != null) && (!(vi.getDescriptorId().equals(variableDescriptorId)))) {
        return null;
    }
    return vi;
}