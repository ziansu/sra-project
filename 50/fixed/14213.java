public void incrementCounter(android.view.View v) {
    selectedCounter.setCurrentValue(((selectedCounter.getCurrentValue()) + 1));
    selectedCounter.setDate(new java.util.Date());
    updateCurrentValueField();
}