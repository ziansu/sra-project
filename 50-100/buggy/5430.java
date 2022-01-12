public synchronized boolean release(java.lang.String hostname) {
    java.util.Iterator<kostiskag.unitynetwork.tracker.runData.RedNodeEntry> iterator = list.listIterator();
    int i = 0;
    while (iterator.hasNext()) {
        kostiskag.unitynetwork.tracker.runData.RedNodeEntry element = iterator.next();
        if (hostname.equals(element.getHostname())) {
            list.remove(i);
            notifyGUI();
            kostiskag.unitynetwork.tracker.App.ConsolePrint((((kostiskag.unitynetwork.tracker.runData.RedNodeTable.pre) + hostname) + " RELEASED ENTRY"));
            return true;
        }
        i++;
    } 
    return false;
}