public void lancementTournoiEliminDirecte(model.TournoiElimDirecte tournoi) {
    viewMode.alerteLancement(tournoi);
    java.util.Collections.shuffle(tournoi.getListEquipesTourActuel());
    creationToursED(tournoi);
}