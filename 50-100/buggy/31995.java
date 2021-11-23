@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    org.openflexo.technologyadapter.diagram.model.action.DropSchemeAction action = DropSchemeAction.actionType.makeNewAction(controller.getVirtualModelInstance(), null, controller.getFlexoController().getEditor());
    action.setDropScheme(dropScheme);
    action.setParentInformations(parentFlexoConceptInstance, parentShapeRole);
    action.setPaletteElement(paletteElement);
    action.setDropLocation(dropLocation);
    action.doAction();
    org.junit.Assert.assertTrue(action.hasActionExecutionSucceeded());
}