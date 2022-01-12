private javafx.collections.ObservableList<digitalAudioEffects.ui.components.Anchor> createAnchors(javafx.collections.ObservableList<digitalAudioEffects.ui.components.Point> points) {
    javafx.collections.ObservableList<digitalAudioEffects.ui.components.Anchor> anchors = javafx.collections.FXCollections.observableArrayList();
    int pos = 0;
    for (digitalAudioEffects.ui.components.Point p : points) {
        digitalAudioEffects.ui.components.Anchor anchor = new digitalAudioEffects.ui.components.Anchor(p, width, height);
        if ((pos == 0) || (pos == ((points.size()) - 1)))
            anchor.disableMoveX();
        
        anchors.add(anchor);
        pos++;
    }
    return anchors;
}