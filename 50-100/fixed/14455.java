@java.lang.Override
public void addErrorMessage(java.lang.String... msg) {
    if ((msg == null) || ((errorPanel) == null)) {
        return ;
    }
    for (java.lang.String str : msg) {
        com.google.gwt.user.client.ui.Label label = new com.google.gwt.user.client.ui.Label(str);
        label.addStyleName("error");
        errorPanel.add(label);
    }
}