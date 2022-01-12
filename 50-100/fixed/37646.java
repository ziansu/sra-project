public void applyState() {
    boolean jComboEnabled = ((accessible) && (enabled)) && (!(readOnly));
    applier.setEnabled((editable ? true : jComboEnabled));
    applier.setEditable(editable);
    applier.setLabelsEnabled(((accessible) && (enabled)));
}