public static void main(java.lang.String[] args) {
    try {
        java.rmi.registry.LocateRegistry.createRegistry(1099);
        DA_Component site0 = new DA_Component(0);
        DA_Component site1 = new DA_Component(1);
        site0.requestToken();
        site0.requestToken();
        site1.requestToken();
        site0.requestToken();
    } catch (java.rmi.RemoteException | java.rmi.AlreadyBoundException | java.net.MalformedURLException e) {
        e.printStackTrace();
    }
}