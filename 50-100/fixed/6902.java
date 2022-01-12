@javafx.fxml.FXML
private void apriCorpiOrb() {
    dati.spazio.CorpoCeleste corpoSel = tabCor.getSelectionModel().getSelectedItem();
    if (corpoSel != null) {
        java.util.List<? extends dati.spazio.CorpoCeleste> corpi = corpoSel.getListaCorpiOrbitanti();
        java.lang.String nomeCorpoFuoco = tabCor.getSelectionModel().getSelectedItem().getNome();
        simulazionesistemaplanetario.gui.tabelle.TabellaController.launchTabellaController(nomeCorpoFuoco, corpi);
    }
}