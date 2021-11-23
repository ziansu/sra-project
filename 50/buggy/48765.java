private void call(final java.util.Set<javafx.util.Callback<java.lang.Throwable, java.lang.Void>> callBacks, final java.lang.Throwable exception) {
    for (final javafx.util.Callback<java.lang.Throwable, java.lang.Void> c : onUpdateCallBacks) {
        c.call(exception);
    }
}