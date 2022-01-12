public void addFixedPositionNavArrows() {
    resoruceMetadataPresenter.getWidget().getElement().getStyle().setPaddingTop((38 + 50), Unit.PX);
    resoruceMetadataPresenter.getCollectionContainer().getElement().getStyle().setPosition(Position.FIXED);
    int height = resoruceMetadataPresenter.getCollectionContainer().getElement().getOffsetHeight();
    resoruceMetadataPresenter.getResourceWidgetContainer().getElement().getStyle().setPaddingTop(height, Unit.PX);
}