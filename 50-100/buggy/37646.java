public void applyState() {
    boolean jComboEnabled = ((accessible) && (enabled)) && (!(readOnly));
    applier.setEnabled(jComboEnabled);
    applier.setEditable((jComboEnabled && (editable)));
    applier.setLabelsEnabled(((accessible) && (enabled)));
}