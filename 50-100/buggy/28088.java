public void removeSelectedSeries() {
    java.util.List<java.lang.String> seriesIdsToRemove = new java.util.ArrayList<java.lang.String>();
    for (gov.nih.nci.nbia.basket.BasketSeriesItemBean item : seriesItems.values()) {
        if (item.isSelected()) {
            seriesIdsToRemove.add((((item.getSeriesSearchResult().getId()) + (gov.nih.nci.nbia.basket.Basket.DELIMETER)) + (item.getGridLocation())));
        }
    }
    for (java.lang.String seriesId : seriesIdsToRemove) {
        seriesItems.remove(seriesId);
    }
    fireChangeEvent();
}