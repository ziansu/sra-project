public void delete(int[] selectedRows) {
    java.util.List<net.sourceforge.ganttproject.task.ResourceAssignment> selected = new java.util.ArrayList<net.sourceforge.ganttproject.task.ResourceAssignment>();
    for (int row : selectedRows) {
        if (row < (myAssignments.size())) {
            selected.add(myAssignments.get(row));
        }
    }
    for (net.sourceforge.ganttproject.task.ResourceAssignment ra : selected) {
        ra.delete();
    }
    myAssignments.removeAll(selected);
    fireTableDataChanged();
}