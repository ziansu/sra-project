void changeThreshold() {
    try {
        alertBackground(thresholdTextField, false);
        threshold = java.lang.Float.valueOf(thresholdTextField.getText());
        trainPerceptron();
    } catch (java.lang.NumberFormatException e) {
        alertBackground(thresholdTextField, true);
        threshold = 0;
    }
}