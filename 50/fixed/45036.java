@java.lang.Override
public void resourceAssignmentsChanged(net.sourceforge.ganttproject.resource.ResourceEvent e) {
    getTreeModel().resourceAssignmentsChanged(java.util.Arrays.asList(e.getResources()));
    repaint();
}