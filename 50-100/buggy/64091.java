void convertSelectedAttrPressed() {
    org.teiid.designer.transformation.ui.reconciler.Binding binding = getSelectedBinding();
    binding.setNewAttrDatatype(bindingListInput.getTargetDatatype(binding));
    updateAttributeConversionPanel(binding);
    bindingListInput.datatypeChanged();
    bindingTableViewer.refresh(true);
    updateRowColors();
    updateMessageArea();
    selectBinding(binding);
}