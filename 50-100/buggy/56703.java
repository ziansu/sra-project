private void checkPage() {
    org.eclipse.swt.widgets.Button ok = getButton(org.eclipse.egit.ui.internal.dialogs.OK);
    if ((ok.isDisposed()) || (fTree.isDisposed())) {
        return ;
    }
    if (multiMode) {
        ok.setEnabled(((fTree.getCheckboxTreeViewer().getCheckedLeafCount()) > 0));
    }else {
        ok.setEnabled((!(branchesList.getSelection().isEmpty())));
    }
}