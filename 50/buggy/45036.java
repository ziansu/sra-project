@java.lang.Override
public void resourceAssignmentsChanged(net.sourceforge.ganttproject.resource.ResourceEvent e) {
    getTreeModel().resourceAssignmentsChanged(e.getResources());
    repaint();
}