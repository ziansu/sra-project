public void onNombreEcheancesDesireModified(model.Emprunt emprunt, int nombreEcheances) {
    if ((emprunt.getEcheances().size()) != nombreEcheances) {
        emprunt.modifyNombreEcheancesDesire(nombreEcheances);
        afterEmpruntModified(emprunt);
    }
}