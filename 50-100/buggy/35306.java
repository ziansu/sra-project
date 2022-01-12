public synchronized boolean releaseByVAddress(java.lang.String vAddress) {
    java.util.Iterator<kostiskag.unitynetwork.tracker.runData.RedNodeEntry> iterator = list.listIterator();
    int i = 0;
    while (iterator.hasNext()) {
        kostiskag.unitynetwork.tracker.runData.RedNodeEntry element = iterator.next();
        if (vAddress.equals(element.getVaddress())) {
            list.remove(i);
            notifyGUI();
            return true;
        }
        i++;
    } 
    return false;
}