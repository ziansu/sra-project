private static boolean shouldSaveButtonSelection(org.eclipse.swt.widgets.Button button) {
    if ((button.getData().equals(java.lang.Boolean.TRUE)) && (button.getGrayed())) {
        return false;
    }
    return true;
}