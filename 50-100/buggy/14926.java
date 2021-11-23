@java.lang.Override
public void undoCommand() {
    parentOfElement.getPlan().getEntryPoints().add(getElementToEdit());
    parentOfElement.getPmlUiExtensionMap().getExtension().add(new java.util.AbstractMap.SimpleEntry(getElementToEdit(), pmlUiExtension));
    associatedState.setEntryPoint(getElementToEdit());
}