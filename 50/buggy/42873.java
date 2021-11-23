private void setNumberInputType() {
    int inputType = android.text.InputType.TYPE_CLASS_NUMBER;
    if ((digsAfterDot) > 0) {
        inputType |= android.text.InputType.TYPE_NUMBER_FLAG_DECIMAL;
    }
    setInputType(inputType);
    setFilters(new android.text.InputFilter[]{ new ru.softbalance.widgets.filters.NumberInputFilter(digsAfterDot, digsBeforeDot) });
}