@java.lang.Override
public void getUserId(int a) throws java.rmi.RemoteException {
    javax.swing.JOptionPane.showMessageDialog(client.IClient.clientManager, ("Your userid is " + a), "UserId. ", javax.swing.JOptionPane.YES_NO_OPTION);
    setUserId(a);
}