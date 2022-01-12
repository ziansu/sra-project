public void addFixedPositionNavArrows() {
    resoruceMetadataPresenter.getWidget().getElement().getStyle().setPaddingTop((38 + 50), Unit.PX);
    int height = resoruceMetadataPresenter.getCollectionContainer().getElement().getOffsetHeight();
    resoruceMetadataPresenter.getResourceWidgetContainer().getElement().getStyle().setPaddingTop(height, Unit.PX);
}