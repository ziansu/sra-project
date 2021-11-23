public void decrementCounter(android.view.View v) {
    if ((selectedCounter.getCurrentValue()) > 0) {
        selectedCounter.setCurrentValue(((selectedCounter.getCurrentValue()) - 1));
        selectedCounter.setDate(new java.util.Date());
        updateCurrentValueField();
    }
}