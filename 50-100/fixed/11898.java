private void displayResult(java.lang.String inputTemperature, float convertedTemperature, boolean isInput_Fahrenheit) {
    mTextView_Result.setText((((inputTemperature + (course.labs.permissionsapp.ConverterActivity.CELSIUS_STATEMENT_CONST)) + convertedTemperature) + (course.labs.permissionsapp.ConverterActivity.FAHRENHEIT_STATEMENT_CONST)));
    if (isInput_Fahrenheit) {
        mTextView_Result.setText((((convertedTemperature + (course.labs.permissionsapp.ConverterActivity.CELSIUS_STATEMENT_CONST)) + inputTemperature) + (course.labs.permissionsapp.ConverterActivity.FAHRENHEIT_STATEMENT_CONST)));
    }
}