private java.util.ArrayList<calendear.action.Task> filterWithCompleteness(boolean isDone, java.util.ArrayList<calendear.action.Task> dataToFilter) {
    java.util.ArrayList<calendear.action.Task> toDisplay = new java.util.ArrayList<calendear.action.Task>();
    toDisplay.addAll(dataToFilter);
    for (int i = 0; i < (toDisplay.size()); i++) {
        if ((toDisplay != null) && ((toDisplay.get(i).isFinished()) != isDone)) {
            toDisplay.set(i, null);
        }
    }
    return toDisplay;
}