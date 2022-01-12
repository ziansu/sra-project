@java.lang.Override
public void onSuccess(de.hdm.itProjektSS17.shared.bo.Unternehmen result) {
    createdUnternehmen.setId(result.getId());
    projektmarktplatzverwaltung.createPartnerprofil(new de.hdm.itProjektSS17.client.gui.DialogBoxTeamErstellen.createTeamCallback(createdUnternehmen));
}