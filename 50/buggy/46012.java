@java.lang.Override
public synchronized void spielbrettBekommen(tm.kalaha.server.Spielbrett spielbrett) throws java.rmi.RemoteException {
    this.spielbrett = spielbrett;
    brettAusgeben();
    meinUI.spielbrettVeraendert();
}