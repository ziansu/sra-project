public static void main(java.lang.String[] args) throws java.rmi.RemoteException {
    try {
        java.rmi.registry.Registry referenciaServicoNomes = java.rmi.registry.LocateRegistry.getRegistry(9898);
        rmi.InterfaceServ refServenteServidor = ((rmi.InterfaceServ) (referenciaServicoNomes.lookup("ServenteServ")));
        rmi.ImplementCli serventeCli = new rmi.ImplementCli(refServenteServidor);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(("erro: " + (e.getMessage())));
    }
}