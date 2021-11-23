@java.lang.Override
public void removeChildGui(org.eclipse.e4.ui.model.application.ui.MUIElement child, org.eclipse.e4.ui.model.application.ui.MElementContainer<org.eclipse.e4.ui.model.application.ui.MUIElement> element) {
    org.eclipse.e4.ui.model.application.ui.advanced.MPerspectiveStack stack = ((org.eclipse.e4.ui.model.application.ui.advanced.MPerspectiveStack) ((org.eclipse.e4.ui.model.application.ui.MElementContainer<?>) (element)));
    org.eclipse.e4.ui.model.application.ui.advanced.MPerspective p = ((org.eclipse.e4.ui.model.application.ui.advanced.MPerspective) (child));
    com.vaadin.ui.Button button = perspective_button.remove(p);
    perspectiveSwitcherPanel.removeComponent(button);
    button2ContextMenu.remove(button);
    refreshPerspectiveStackVisibility(stack);
}