void changeRate() {
    try {
        alertBackground(learningTextField, false);
        rate = java.lang.Double.valueOf(learningTextField.getText());
        trainPerceptron();
    } catch (java.lang.NumberFormatException e) {
        alertBackground(learningTextField, true);
        rate = 0.5F;
    }
}