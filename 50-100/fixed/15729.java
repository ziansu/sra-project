@java.lang.Override
public boolean validate() {
    return ((((!(spacesForTab_.getValue())) || (tabWidth_.validatePositive("Tab width"))) && ((!(showMargin_.getValue())) || (marginCol_.validate("Margin column")))) && (alwaysCompleteChars_.validateRange("Characters entered", 1, 100))) && (alwaysCompleteDelayMs_.validateRange("Keyboard idle (ms)", 0, 10000));
}