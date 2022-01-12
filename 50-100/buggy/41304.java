protected void setupSelection(boolean showOtherDates, boolean inRange, boolean inMonth, boolean disabled) {
    boolean enabled = (inMonth && inRange) && (!disabled);
    setEnabled(enabled);
    setVisibility((enabled || showOtherDates ? android.view.View.VISIBLE : android.view.View.INVISIBLE));
}