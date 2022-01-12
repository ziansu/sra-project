public void lancementPhaseFinale(model.TournoiPoules tournoi) {
    tournoi.getListEquipesTourActuel().clear();
    tournoi.getListEquipesTourActuel().addAll(tournoi.getListEquiGagnantes());
    tournoi.getListEquiGagnantes().clear();
    java.util.Collections.shuffle(tournoi.getListEquipesTourActuel());
    creationToursED(tournoi);
}