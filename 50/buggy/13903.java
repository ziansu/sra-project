@java.lang.Override
public void onClick(android.view.View v) {
    if (((currentValue) > (minValue)) && (((currentValue) - (stepValue)) > (minValue))) {
        currentValue -= stepValue;
        updateCurrentValue();
    }
}