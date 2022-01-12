public void onClick(final com.google.gwt.event.dom.client.ClickEvent event) {
    if ((localConfig) != null) {
        java.lang.String removeString = removeThisCode.getText();
        com.google.gwt.user.client.Window.alert(("config removed: " + (localConfig.getItem(removeString))));
        localConfig.removeItem(removeString);
        removeThisCode.setText("");
        configListtable();
        if (removeSound.play()) {
            com.google.gwt.user.client.Window.alert("sound played");
        }else {
            com.google.gwt.user.client.Window.alert("sound does not played");
        }
    }
}