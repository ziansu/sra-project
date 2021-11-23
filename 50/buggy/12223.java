public void onProviderDisabled(java.lang.String arg0) {
    java.lang.System.out.println("1");
    setChanged();
    this.notifyObservers();
}