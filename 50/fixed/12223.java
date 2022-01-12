public void onProviderDisabled(java.lang.String arg0) {
    setChanged();
    this.notifyObservers();
}