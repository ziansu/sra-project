void convertSelectedSqlPressed() {
    org.teiid.designer.transformation.ui.reconciler.Binding binding = getSelectedBinding();
    if (binding.canConvertSqlSymbol()) {
        binding.acceptSqlConversion();
    }
    updateSymbolConversionPanel(binding);
    bindingListInput.datatypeChanged();
    bindingTableViewer.refresh(true);
    updateRowColors();
    updateMessageArea();
    selectBinding(binding);
}