@java.lang.Override
public void rekisteroiPelaaja(ojpt2.PelaajaIF pelaaja) throws java.rmi.RemoteException {
    kaikkiPelaajat.put(pelaajaID, pelaaja);
    (pelaajaID)++;
}