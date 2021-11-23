protected void fillContextMenu(org.eclipse.jface.action.IMenuManager manager) {
    boolean isEmpty = getViewer().getSelection().isEmpty();
    if (isEmpty) {
        manager.add(fActionClone);
    }else {
        manager.add(fActionOpen);
        manager.add(fActionShowInHistory);
        manager.add(new org.eclipse.jface.action.Separator());
        manager.add(fActionDelete);
        manager.add(new org.eclipse.jface.action.Separator());
        manager.add(fActionProperties);
    }
}