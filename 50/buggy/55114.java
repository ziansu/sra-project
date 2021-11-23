public void setModel(graphs.DrawableGraph newModel) {
    this.model = newModel;
    model.addObserver(graphPanelView);
    graphPanelView.setModel(newModel);
    graphPanelView.repaint();
    setActionListener();
    setAlgorithmsToUse(newModel);
}