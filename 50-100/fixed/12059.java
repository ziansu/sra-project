void changeMaxRange() {
    try {
        if ((java.lang.Double.valueOf(wRangeMaxValue.getText())) < (minRange))
            alertBackground(wRangeMaxValue, true);
        else {
            alertBackground(wRangeMaxValue, false);
            maxRange = java.lang.Double.valueOf(wRangeMaxValue.getText());
            trainPerceptron();
        }
    } catch (java.lang.NumberFormatException e) {
        alertBackground(wRangeMaxValue, true);
        maxRange = 0.5F;
    }
}