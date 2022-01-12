@java.lang.Override
public void createWidget(org.eclipse.e4.ui.model.application.ui.MUIElement element, org.eclipse.e4.ui.model.application.ui.MElementContainer<org.eclipse.e4.ui.model.application.ui.MUIElement> parent) {
    if (!(element instanceof org.eclipse.e4.ui.model.application.ui.menu.MToolBar)) {
        return ;
    }
    javafx.geometry.Orientation orientation = getOrientation(element);
    if (orientation == (javafx.geometry.Orientation.VERTICAL)) {
        javafx.scene.layout.VBox toolBar = new javafx.scene.layout.VBox();
        element.setWidget(toolBar);
    }
    javafx.scene.layout.HBox toolBar = new javafx.scene.layout.HBox();
    element.setWidget(toolBar);
}