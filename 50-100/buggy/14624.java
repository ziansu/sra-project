@java.lang.Override
public int getRowCount() {
    nl.detoren.ijc.data.wedstrijden.Wedstrijden ws = controller.getWedstrijden();
    nl.detoren.ijc.data.wedstrijden.Groepswedstrijden gws = ws.getGroepswedstrijdenNiveau(groepID);
    if (gws != null) {
        java.util.ArrayList<nl.detoren.ijc.data.wedstrijden.Wedstrijd> w = gws.getWedstrijden();
        return w.size();
    }else {
        return 0;
    }
}