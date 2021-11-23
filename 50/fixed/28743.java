@java.lang.Override
public void onClick(android.view.View v) {
    if (((currentValue) < (maxValue)) && (((currentValue) + (stepValue)) <= (maxValue))) {
        currentValue += stepValue;
        updateCurrentValue();
    }
}