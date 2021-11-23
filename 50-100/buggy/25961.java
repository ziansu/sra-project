@java.lang.Override
public org.openflexo.foundation.fml.rt.VirtualModelInstance loadResourceData(org.openflexo.toolbox.IProgress progress) throws org.openflexo.foundation.IOFlexoException, org.openflexo.foundation.InconsistentDataException, org.openflexo.foundation.InvalidModelDefinitionException, org.openflexo.foundation.InvalidXMLException, org.openflexo.foundation.resource.FlexoFileNotFoundException {
    org.openflexo.foundation.fml.rt.VirtualModelInstance returned = super.loadResourceData(progress);
    boolean containerWasDeserializing = getContainer().isDeserializing();
    if (!containerWasDeserializing) {
        getContainer().startDeserializing();
    }
    startDeserializing();
    getContainer().getView().addToVirtualModelInstances(returned);
    returned.clearIsModified();
    stopDeserializing();
    if (!containerWasDeserializing) {
        getContainer().stopDeserializing();
    }
    return returned;
}