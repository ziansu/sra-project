@org.eclipse.e4.core.di.annotations.Optional
@org.eclipse.e4.core.di.annotations.Execute
public void execute(@javax.inject.Named(value = org.eclipse.e4.ui.services.IServiceConstants.ACTIVE_SHELL)
final org.eclipse.swt.widgets.Shell shell, org.eclipse.e4.core.contexts.IEclipseContext context) {
    org.bbaw.bts.ui.main.dialogs.UserManagementDialog dialog = org.eclipse.e4.core.contexts.ContextInjectionFactory.make(org.bbaw.bts.ui.main.dialogs.UserManagementDialog.class, context);
    if ((dialog.open()) == (dialog.OK)) {
    }
}