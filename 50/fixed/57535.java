private void populateDialog() {
    wStepname.selectAll();
    wFieldName.setText(meta.getOutputField());
    wAlgoBox.setItems(meta.getAlgoBoxItems());
}