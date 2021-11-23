public void removeGraphicalMenuHandler() {
    if (!((com.google.gwt.dom.client.Document.get().getElementById("graphical menu")) == null)) {
        com.google.gwt.dom.client.Document.get().getElementById("graphical menu").removeFromParent();
    }
}