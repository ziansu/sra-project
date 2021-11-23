public void removeGraphicalMenuHandler() {
    removeMediaFromParent(com.google.gwt.dom.client.Document.get().getElementById("graphical menu"));
    com.google.gwt.dom.client.Document.get().getElementById("graphical menu").removeFromParent();
}