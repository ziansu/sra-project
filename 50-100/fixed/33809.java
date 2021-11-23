private synchronized java.util.Vector<model.Address> getNodesListFromTracker() {
    try {
        java.util.Vector<model.Address> nodes = tracker.getNodes();
        return nodes;
    } catch (java.rmi.RemoteException e) {
        e.printStackTrace();
        java.lang.System.out.println("Tracker has stopped working");
        return null;
    }
}