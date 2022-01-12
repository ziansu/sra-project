private void checkPage() {
    org.eclipse.swt.widgets.Button ok = getButton(org.eclipse.egit.ui.internal.dialogs.OK);
    if (ok.isDisposed()) {
        return ;
    }
    if (multiMode) {
        if (((fTree) == null) || (fTree.isDisposed())) {
            return ;
        }
        ok.setEnabled(((fTree.getCheckboxTreeViewer().getCheckedLeafCount()) > 0));
    }else {
        ok.setEnabled((!(branchesList.getSelection().isEmpty())));
    }
}