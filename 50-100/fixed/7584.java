public void focusOut(org.sbolstandard.core2.ComponentDefinition comp) throws org.sbolstandard.core2.SBOLValidationException {
    if ((canvasCD) == comp) {
        return ;
    }
    updateCanvasCD();
    org.sbolstandard.core2.ComponentDefinition parentComponent = parentCDs.pop();
    while (!(parentComponent.equals(comp))) {
        parentComponent = parentCDs.pop();
    } 
    load(parentComponent);
    eventBus.publish(new com.clarkparsia.sbol.editor.event.FocusOutEvent(this, parentComponent));
}