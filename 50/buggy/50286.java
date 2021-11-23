@com.google.gwt.uibinder.client.UiHandler(value = "save_selfDisclosure")
protected void onSaveSelfDisclosureClick(com.google.gwt.event.dom.client.ClickEvent event) {
    this.setBO(this.getBO());
    com.google.gwt.user.client.Window.alert(this.getBO().getOccupation());
    this.saveBO();
}