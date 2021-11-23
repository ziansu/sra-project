@javafx.fxml.FXML
public void onDeselectAll() throws java.sql.SQLException {
    for (java.lang.String selectedEpisode : selectedEpisodes) {
        java.lang.System.out.println(selectedEpisode);
    }
    updatePanes(false);
}