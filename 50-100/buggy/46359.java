void changeAllColumnDatatypesButtonPressed() {
    for (int i = 0; i < (bindingListInput.getBindingList().size()); i++) {
        org.teiid.designer.transformation.ui.reconciler.Binding binding = bindingListInput.getBindingList().get(i);
        if ((binding.hasTypeConflict()) && (binding.canConvertSqlSymbol())) {
            binding.acceptSqlConversion();
        }
    }
    bindingListInput.datatypeChanged();
    bindingTableViewer.refresh(true);
    updateRowColors();
    updateMessageArea();
    selectFirstBinding();
}