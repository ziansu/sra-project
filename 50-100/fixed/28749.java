private boolean validate() {
    return (((name.getText().toString().length()) > 0) && ((java.lang.Integer.parseInt(calories.getText().toString())) > 0)) && ((java.lang.Integer.parseInt(available.getText().toString())) > 0);
}