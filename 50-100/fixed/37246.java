@java.lang.Override
public void inputChanged(org.eclipse.jface.viewers.Viewer viewer, java.lang.Object oldInput, java.lang.Object newInput) {
    if (newInput instanceof org.eclipse.core.resources.IWorkspaceRoot) {
        _problems = new java.util.ArrayList<com.liferay.ide.project.ui.migration.ProblemsContainer>();
        try {
            com.liferay.ide.project.ui.migration.MigrationProblemsContainer container = com.liferay.ide.project.core.upgrade.UpgradeAssistantSettingsUtil.getObjectFromStore(com.liferay.ide.project.ui.migration.MigrationProblemsContainer.class);
            if (container != null) {
                _problems.add(container);
            }
        } catch (java.lang.Exception e) {
        }
    }
}