@java.lang.Override
public void onSuccess(java.util.Vector<de.hdm.gruppe1.shared.bo.Baugruppe> alleBaugruppen) {
    allBaugruppe = alleBaugruppen;
    if ((allBaugruppe.isEmpty()) == true) {
        com.google.gwt.user.client.Window.alert("Es sind leider keine Daten in der Datenbank vorhanden.");
    }else {
        for (int c = 0; c < (allBaugruppe.size()); c++) {
            listBoxBaugruppen.addItem(allBaugruppe.get(c).getName());
        }
    }
}