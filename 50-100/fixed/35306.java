public synchronized boolean releaseByVAddress(java.lang.String vAddress) {
    java.util.Iterator<kostiskag.unitynetwork.tracker.runData.RedNodeEntry> iterator = list.listIterator();
    while (iterator.hasNext()) {
        kostiskag.unitynetwork.tracker.runData.RedNodeEntry element = iterator.next();
        if (vAddress.equals(element.getVaddress())) {
            iterator.remove();
            notifyGUI();
            return true;
        }
    } 
    return false;
}