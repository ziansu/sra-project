protected void editItem(org.eclipse.jface.viewers.ISelection sel) {
    org.eclipse.jface.viewers.IStructuredSelection selection = ((org.eclipse.jface.viewers.IStructuredSelection) (sel));
    java.lang.String existing = ((java.lang.String) (selection.getFirstElement()));
    java.lang.String value = getExistingInputObject(existing.replace(" ", ""));
    if (value != null) {
        int indexOf = list.indexOf(existing);
        list.remove(existing);
        list.add(indexOf, value);
        viewer.refresh();
    }
}