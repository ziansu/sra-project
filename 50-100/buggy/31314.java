@java.lang.SuppressWarnings(value = "unchecked")
public void setLocation(T location) {
    final com.vaadin.data.util.BeanItemContainer<org.vaadin.addons.locationtextfield.GeocodedLocation> container = ((com.vaadin.data.util.BeanItemContainer<org.vaadin.addons.locationtextfield.GeocodedLocation>) (this.getContainerDataSource()));
    container.removeAllItems();
    if (location != null) {
        container.addBean(location);
        this.lastKnownTextContent = location.getGeocodedAddress();
    }
    super.setValue(location);
}