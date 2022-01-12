private void createProcessTypeControls(org.eclipse.swt.widgets.Composite searchComposite) {
    comboModelProcessType = new sernet.verinice.iso27k.rcp.ComboModel(new sernet.verinice.iso27k.rcp.IComboModelLabelProvider<sernet.verinice.interfaces.bpm.KeyMessage>() {
        @java.lang.Override
        public java.lang.String getLabel(sernet.verinice.interfaces.bpm.KeyMessage object) {
            return object.getValue();
        }
    });
    comboProcessType = createComboBox(searchComposite);
    comboProcessType.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
        @java.lang.Override
        public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
            comboModelProcessType.setSelectedIndex(comboProcessType.getSelectionIndex());
            selectedProcessType = comboModelProcessType.getSelectedObject();
        }
    });
}