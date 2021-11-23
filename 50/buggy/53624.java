public void nodeChanged(org.freeplane.features.map.NodeChangeEvent event) {
    if (event.getProperty().equals(NodeModel.NODE_TEXT)) {
        disposeDialog();
    }
}