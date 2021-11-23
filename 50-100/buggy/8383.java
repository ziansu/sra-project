@java.lang.Override
public void startListening() {
    try {
        java.lang.String username = s3proftaak.Client.ClientAdministration.getInstance().getAccount().getUsername();
        java.lang.System.out.println(s3proftaak.Client.RMIClient.getInstance());
        java.lang.System.out.println(s3proftaak.Client.RMIClient.getInstance().getServerAdministration());
        s3proftaak.Client.RMIClient.getInstance().getServerAdministration().addListener(username, this, "LobbyList");
    } catch (java.rmi.RemoteException ex) {
        s3proftaak.Client.ClientAdministration.getInstance().connectionLost();
    }
}