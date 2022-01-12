void changeMinRange() {
    try {
        if ((java.lang.Double.valueOf(wRangeMinValue.getText())) > (maxRange))
            alertBackground(wRangeMinValue, true);
        else {
            alertBackground(wRangeMinValue, false);
            minRange = java.lang.Double.valueOf(wRangeMinValue.getText());
            trainPerceptron();
        }
    } catch (java.lang.NumberFormatException e) {
        alertBackground(wRangeMinValue, true);
        minRange = -0.5F;
    }
}