private void updateFinishButton() {
    if (taggedResultsRadioButton.isSelected()) {
        wizPanel.setFinish(areTagsSelected());
    }else {
        wizPanel.setFinish(true);
    }
}