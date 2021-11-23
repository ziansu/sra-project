private void nimmAusgewaehlteMedienZurueck() {
    java.util.List<de.uni_hamburg.informatik.swt.se2.mediathek.materialien.Verleihkarte> verleihkarten = getSelectedVerleihkarten();
    java.util.List<de.uni_hamburg.informatik.swt.se2.mediathek.materialien.medien.Medium> medien = new java.util.ArrayList<de.uni_hamburg.informatik.swt.se2.mediathek.materialien.medien.Medium>();
    for (de.uni_hamburg.informatik.swt.se2.mediathek.materialien.Verleihkarte verleihkarte : verleihkarten) {
        medien.add(verleihkarte.getMedium());
    }
    try {
        _verleihService.nimmZurueck(medien, de.uni_hamburg.informatik.swt.se2.mediathek.fachwerte.Datum.heute());
    } catch (de.uni_hamburg.informatik.swt.se2.mediathek.services.verleih.ProtokollierException exception) {
        javax.swing.JOptionPane.showMessageDialog(null, exception.getMessage(), "Fehlermeldung", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}