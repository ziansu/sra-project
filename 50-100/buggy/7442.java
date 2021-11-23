public static void main(java.lang.String[] args) {
    try {
        java.rmi.registry.LocateRegistry.createRegistry(1099);
        DA_MessageHandler obj1 = new DA_MessageHandler(1);
        DA_MessageHandler obj2 = new DA_MessageHandler(2);
        obj2.sendMessageDelayed("first message", 1, 1000);
        obj2.sendMessageDelayed("second message", 1, 10);
    } catch (java.rmi.RemoteException | java.rmi.AlreadyBoundException | java.net.MalformedURLException e) {
        e.printStackTrace();
    }
}