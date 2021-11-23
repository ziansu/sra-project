@org.eclipse.e4.core.di.annotations.Execute
@java.lang.SuppressWarnings(value = "static-method")
public void execute(org.eclipse.e4.ui.workbench.IWorkbench workbench, org.eclipse.e4.ui.workbench.modeling.EPartService partService, org.eclipse.swt.widgets.Shell shell) {
    if (org.eclipse.jface.dialogs.MessageDialog.openConfirm(shell, Messages.ExitHandler_Title, Messages.ExitHandler_Text)) {
        final com.b3dgs.lionengine.editor.project.ProjectsPart part = com.b3dgs.lionengine.editor.UtilEclipse.getPart(partService, ProjectsPart.ID, com.b3dgs.lionengine.editor.project.ProjectsPart.class);
        part.close();
        workbench.close();
    }
}