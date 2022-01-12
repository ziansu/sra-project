@javafx.fxml.FXML
void stopListeners(javafx.scene.input.MouseEvent event) {
    java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.ArrayList<java.lang.String>> streamerToStreamSourcesMap = IM.getStreamerToStreamMap();
    java.util.Set<java.util.Map.Entry<java.lang.String, java.util.ArrayList<java.lang.String>>> setOfEntries = streamerToStreamSourcesMap.entrySet();
    for (java.util.Map.Entry<java.lang.String, java.util.ArrayList<java.lang.String>> e : setOfEntries) {
        for (java.lang.String source : e.getValue()) {
            GUIController.outputText((((e.getKey()) + " ") + source));
        }
    }
}