private void notifierClient(java.lang.Object arg) throws java.rmi.RemoteException {
    for (m1miage.tigre_et_euphrate.Tigre_et_Euphrate.modeles.connexion.InterfaceServeurClient c : this.clients) {
        c.notifierChangement(arg);
    }
}