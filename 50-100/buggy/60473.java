public static java.lang.String saveGame(javafx.stage.Stage primaryStage, java.lang.String saveLocation, java.util.ArrayList<java.lang.String> history, java.util.ArrayList<java.lang.String> notationHistory) {
    if (chess.ChessIO.checkForNewGame(history)) {
        return "";
    }
    java.lang.String fileName;
    if (saveLocation != null) {
        fileName = saveLocation;
    }else {
        fileName = chess.ChessIO.getSaveFileName(primaryStage);
        if (fileName.equals("")) {
            return "";
        }
    }
    return chess.ChessIO.printToFile(fileName, history, notationHistory);
}