public void removeSelectedSeries() {
    java.util.List<java.lang.String> seriesIdsToRemove = new java.util.ArrayList<java.lang.String>();
    for (gov.nih.nci.nbia.basket.BasketSeriesItemBean item : seriesItems.values()) {
        if (item.isSelected()) {
            seriesIdsToRemove.add(item.getSeriesSearchResult().getId().toString());
        }
    }
    for (java.lang.String seriesId : seriesIdsToRemove) {
        seriesItems.remove(seriesId);
    }
    fireChangeEvent();
}