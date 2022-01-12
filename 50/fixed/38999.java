private void disableTimerMillis() {
    if ((windowScrollHandlerRegistration) != null) {
        windowScrollHandlerRegistration.removeHandler();
        windowScrollHandlerRegistration = null;
    }
    timeOutPopupCounterText.setText("");
    timeOutPopupCounterPanel.setVisible(false);
}