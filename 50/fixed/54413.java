public void addServerDatareceivedListener(wetsch.wirelessbarcodescannerserver.BarcodeServerDataListener listener) {
    if ((listeners) == null)
        listeners = new java.util.HashSet<wetsch.wirelessbarcodescannerserver.BarcodeServerDataListener>();
    
    if (!(listeners.contains(listener)))
        listeners.add(listener);
    
}