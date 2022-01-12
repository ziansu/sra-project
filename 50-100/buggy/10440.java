protected void desconectarUsuario() {
    try {
        if ((servidor) != null) {
            java.rmi.server.UnicastRemoteObject.unexportObject(this, true);
            javax.swing.JOptionPane.showMessageDialog(this, "Voc� se desconectou do Servidor...");
            configuraBotoes(true);
            servidor = null;
        }
    } catch (java.rmi.NoSuchObjectException e) {
        e.printStackTrace();
    }
    try {
        iServer.desconectar(informacoesCliente());
    } catch (java.rmi.RemoteException e) {
        e.printStackTrace();
    }
}