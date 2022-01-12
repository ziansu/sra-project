public synchronized boolean release(java.lang.String hostname) {
    java.util.Iterator<kostiskag.unitynetwork.tracker.runData.RedNodeEntry> iterator = list.listIterator();
    while (iterator.hasNext()) {
        kostiskag.unitynetwork.tracker.runData.RedNodeEntry element = iterator.next();
        if (hostname.equals(element.getHostname())) {
            iterator.remove();
            notifyGUI();
            kostiskag.unitynetwork.tracker.App.ConsolePrint((((kostiskag.unitynetwork.tracker.runData.RedNodeTable.pre) + hostname) + " RELEASED ENTRY"));
            return true;
        }
    } 
    return false;
}