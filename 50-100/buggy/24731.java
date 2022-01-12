public void buildComponent(java.util.ArrayList<entity.DescriptionLabel> descriptionLabels, int view) {
    _currentView = view;
    _mainVbox.getChildren().clear();
    double totalBuildedHeight = 0;
    for (int i = 0; i < (descriptionLabels.size()); i++) {
        _mainVbox.add(buildIndividualLabel(descriptionLabels.get(i), totalBuildedHeight), 0, i);
        totalBuildedHeight += descriptionLabels.get(i).getHeight();
    }
}