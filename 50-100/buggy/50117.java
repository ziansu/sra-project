@java.lang.Override
public void showError(java.lang.String msg) {
    if (msg == null) {
        errorPanel.clear();
    }
    errorPanel.clear();
    java.lang.String[] lines = msg.split("\n");
    for (java.lang.String item : lines) {
        errorPanel.add(new com.google.gwt.user.client.ui.Label(item));
    }
}