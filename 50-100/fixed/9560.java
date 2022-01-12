private void fillLocalToolBar(org.eclipse.jface.action.IToolBarManager manager) {
    manager.add(boldTextAction);
    manager.add(italicTextAction);
    manager.add(underlineTextAction);
    manager.add(clearTextAction);
    manager.add(new org.eclipse.jface.action.Separator());
    manager.add(addNewNoteAction);
    manager.add(clearNoteAction);
}