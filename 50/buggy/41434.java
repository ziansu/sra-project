boolean isGroupSelected() {
    return (((org.eclipse.jface.viewers.StructuredSelection) (tableAccountGroups.getSelection())).toList().size()) > 0;
}