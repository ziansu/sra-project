public void setWebAddress(java.net.URI webAddress) {
    if (webAddress != null)
        biocode.fims.entities.Bcid.isValidUrl(webAddress);
    
    this.webAddress = webAddress;
}