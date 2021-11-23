public void removeServerDatareceivedListener(wetsch.wirelessbarcodescannerserver.BarcodeServerDataListener listener) {
    if (listeners.contains(listener))
        listeners.remove(listener);
    
    if ((listeners.size()) == 0)
        listeners = null;
    
}