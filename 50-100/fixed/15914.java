public void resetMenuComponents() {
    ViDSortGUI.Mode mode = ViDSortGUI.getInstance().getMode();
    java.awt.GridBagConstraints gridConstraints = getDefaultGridConstraints();
    removeComboBox(leftAlgorithmComboBox);
    removeComboBox(rightAlgorithmComboBox);
    if (mode == (ViDSortGUI.Mode.SINGLE_ALGORITHM_MODE)) {
        gridConstraints.gridy = 1;
        add(rightAlgorithmComboBox, gridConstraints);
    }else
        if (mode == (ViDSortGUI.Mode.COMPARISON_MODE)) {
            gridConstraints.gridy = 1;
            add(leftAlgorithmComboBox, gridConstraints);
            gridConstraints.gridy = 2;
            add(rightAlgorithmComboBox, gridConstraints);
        }
    
}