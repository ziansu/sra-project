@java.lang.Override
public void undoCommand() {
    parentOfElement.getPlan().getEntryPoints().add(getElementToEdit());
    parentOfElement.getPmlUiExtensionMap().getExtension().put(getElementToEdit(), pmlUiExtension);
    if ((associatedState) != null) {
        associatedState.setEntryPoint(getElementToEdit());
    }
}