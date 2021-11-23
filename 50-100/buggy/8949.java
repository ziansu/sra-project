public void isAddStepsValid(java.lang.String value) {
    if ((value.length()) > 0) {
        java.lang.String regex = "-?[\\d]+";
        validate(value, regex, addSteps);
        if (!(value.matches(regex))) {
            errorAddSteps.setVisible(true);
        }
        if ((java.lang.Integer.valueOf(value)) >= 0) {
            errorAddSteps.setVisible(false);
        }
    }
}