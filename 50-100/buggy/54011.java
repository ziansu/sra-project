public org.wwarn.mapcore.client.components.customwidgets.facet.FacetWidget buildDisplay() {
    panel = new org.wwarn.mapcore.client.components.customwidgets.facet.VerticalPanel();
    setupListPanel(facetWidgetItems);
    setupScrollPanel();
    panel.add(buildHTMLHeader());
    searchBox.addKeyUpHandler(this);
    searchBox.addStyleName(org.wwarn.mapcore.client.components.customwidgets.facet.FacetSearchableCheckBoxWidget.STYLE_SEARCH_BOX);
    panel.add(searchBox);
    panel.add(scrollpanel);
    return this;
}