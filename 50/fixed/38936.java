@java.lang.Override
public void notifyNewArticle(server.Article a) throws java.rmi.RemoteException {
    ui.client.IClientGUI clientGUI = main.MainPubSub.getClientGUI();
    clientGUI.notifyNewArticle(a);
}