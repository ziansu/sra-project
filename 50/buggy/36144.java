private void setCheckBoxAsChecked(boolean isCompleted) {
    javafx.application.Platform.runLater(() -> {
        try {
            chkDone.setSelected(isCompleted);
        } catch (java.lang.NullPointerException e) {
        }
    });
}