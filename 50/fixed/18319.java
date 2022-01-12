@java.lang.Override
public void afficher(java.lang.String texte) throws java.rmi.RemoteException {
    if ((this.client) != null)
        this.client.afficher(texte);
    
}