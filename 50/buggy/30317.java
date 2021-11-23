public void onNombreEcheancesDesireModified(model.Emprunt emprunt, int nombreEcheances) {
    if ((emprunt.getEcheances().size()) != nombreEcheances) {
        afterEmpruntModified(emprunt);
        emprunt.modifyNombreEcheancesDesire(nombreEcheances);
    }
}