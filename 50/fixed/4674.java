@java.lang.Override
public boolean isEnabledFor(org.eclipse.buildship.ui.generic.NodeSelection selection) {
    return ((!(selection.isEmpty())) && (selection.hasAllNodesOfType(org.eclipse.buildship.ui.taskview.ProjectNode.class))) && (selection.isSingleSelection());
}