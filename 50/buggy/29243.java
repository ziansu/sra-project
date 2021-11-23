@java.lang.Override
public boolean isVisibleFor(org.eclipse.buildship.ui.generic.NodeSelection selection) {
    return selection.hasAllNodesOfType(org.eclipse.buildship.ui.taskview.ProjectNode.class);
}