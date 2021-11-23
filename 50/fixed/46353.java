public boolean isOutOfWindow(long time) {
    return ((state.getWindowMs()) != (-1)) && ((time - (timestamp)) > (state.getWindowMs()));
}