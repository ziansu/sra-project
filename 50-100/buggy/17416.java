public void callBackAllClients() throws java.rmi.RemoteException {
    int i = 1;
    for (ClientInterface eachClient : executeGameObj.clientList) {
        Server.logObject.info(("Call back executed for player with id " + (eachClient.getSelfId())));
        java.lang.String mesg = ("Client " + i) + " has been registered";
        try {
            eachClient.alert(executeGameObj.board);
        } catch (java.rmi.RemoteException re) {
            java.lang.System.out.println("Exception alerting client, removing it.");
            java.lang.System.out.println(re);
            executeGameObj.clientList.remove(eachClient);
        }
        i++;
    }
}