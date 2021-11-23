public javafx.scene.layout.VBox getView() {
    if ((view) == null)
        loadFXML();
    
    return view;
}