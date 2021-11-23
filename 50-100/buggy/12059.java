void changeMaxRange() {
    try {
        if ((java.lang.Float.valueOf(wRangeMaxValue.getText())) < (minRange))
            alertBackground(wRangeMaxValue, true);
        else {
            alertBackground(wRangeMaxValue, false);
            maxRange = java.lang.Float.valueOf(wRangeMaxValue.getText());
            trainPerceptron();
        }
    } catch (java.lang.NumberFormatException e) {
        alertBackground(wRangeMaxValue, true);
        maxRange = 0.5F;
    }
}