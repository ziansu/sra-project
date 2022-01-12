public void lookup(java.lang.String method, java.lang.Object[] args) {
    if (method == "create") {
        try {
            masterService.createFile(((java.lang.String) (args[0])), ((java.lang.Integer) (args[1])), true);
        } catch (java.rmi.RemoteException e) {
            e.printStackTrace();
        }
    }
}