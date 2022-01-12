public void addGerritListener(com.houghtonassociates.bamboo.plugins.dao.GerritProcessListener l) {
    if ((gerritListeners) == null)
        gerritListeners = new java.util.ArrayList<com.houghtonassociates.bamboo.plugins.dao.GerritProcessListener>();
    
    if (!(gerritListeners.contains(l))) {
        sendCurrentOpenChanges(l);
        gerritListeners.add(l);
    }
}