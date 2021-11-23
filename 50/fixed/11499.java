@java.lang.Override
public void itemStateChanged(java.awt.event.ItemEvent arg0) {
    if ((selected) instanceof view.DText) {
        ((view.DText) (selected)).setFont(comboBox.getSelectedItem().toString());
        modelChanged(selected.model);
    }
}