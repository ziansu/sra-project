private void trainMap() {
    runButton.setEnabled(false);
    if (exhaustiveRadioButton.isSelected()) {
        createExhaustiveSOM();
    }else {
        createSampleSOM();
    }
    runButton.setEnabled(true);
}