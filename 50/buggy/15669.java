@java.lang.Override
protected void notifyListeners(final java.lang.String text) {
    final java.io.File file = getFile();
    if (file != null) {
        notifySelectionListeners(file);
    }else {
        super.notifyListeners(text);
    }
}