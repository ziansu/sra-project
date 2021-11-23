public void refresh() {
    if (!(model.isSingleMode())) {
        model.setRelatedNodes(model.getRelatedNodes());
    }
    fireStateChange();
    view.setRootObject();
}