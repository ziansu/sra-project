@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    setTitleActivity();
    android.view.View view = inflater.inflate(R.layout.fragment_riepilogo, container, false);
    final java.lang.String idPersonaggio = com.ficheralezzi.fantasygo.ModalitaNearPvE.Model.Modalità.MModalitàNearPvE.getSingletoneInstance().getIdPersonaggioScelto();
    com.ficheralezzi.fantasygo.ModalitaNearPvE.Model.MPersonaggio mPersonaggio = com.ficheralezzi.fantasygo.ModalitaNearPvE.Model.MGiocatore.getSingletoneInstance().getOnePersonaggioById(idPersonaggio);
    riempiTableCaratteristiche(mPersonaggio, view);
    com.ficheralezzi.fantasygo.ModalitaNearPvE.Model.MRegoleDiSoddisfazione mRegoleDiSoddisfazione = com.ficheralezzi.fantasygo.ModalitaNearPvE.Model.MRegoleDiSoddisfazione.getSingletoneInstance();
    riempiTabellaRegoleDiSoddisfazione(mRegoleDiSoddisfazione, view);
    setButtons();
    setGoButtonListener();
    return view;
}