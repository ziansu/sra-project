public static org.gvsig.app.project.documents.view.gui.IView createViewIfNeeded(java.lang.String viewName, java.lang.String crs) {
    org.gvsig.andami.ui.mdiManager.IWindow iWindow = org.gvsig.andami.PluginServices.getMDIManager().getActiveWindow();
    if (iWindow instanceof javax.swing.text.View) {
        return ((org.gvsig.app.project.documents.view.gui.IView) (iWindow));
    }
    return es.icarto.gvsig.commons.utils.Andami.createView(viewName, crs);
}