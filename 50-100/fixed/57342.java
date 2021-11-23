@java.lang.Override
public void start(javafx.stage.Stage primaryStage) {
    this.primaryStage = primaryStage;
    initRootLayout();
    java.io.File file = getTournamentFilePath();
    if (file == null) {
        this.showTournamentEditDialog(new tournamentManagement.model.Tournament());
    }else {
        if (this.loadTournamentDataFromFile(file))
            this.showPlayersList();
        else
            this.showTournamentEditDialog(new tournamentManagement.model.Tournament());
        
    }
}