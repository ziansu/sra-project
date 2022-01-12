private synchronized void clear() {
    if (model.FileDialogClass.showConfirmation("Are you sure you want to clear the log? (There is no undo)", "Are you sure?")) {
        logOutputField.setText("");
        lines.removeAll(lines);
    }
}