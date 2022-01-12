@java.lang.SuppressWarnings(value = "unchecked")
public void setLocation(T location) {
    getContainerDataSource().removeAllItems();
    if (location != null) {
        getContainerDataSource().addBean(location);
        this.lastKnownTextContent = location.getGeocodedAddress();
    }else {
        this.lastKnownTextContent = null;
    }
    super.setValue(location);
}