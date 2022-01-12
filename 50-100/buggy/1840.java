public static void saveGameAs(javafx.stage.Stage primaryStage, java.util.ArrayList<java.lang.String> history, java.util.ArrayList<java.lang.String> notationHistory) {
    if (chess.ChessIO.checkForNewGame(history)) {
        return ;
    }
    java.lang.String fileName = chess.ChessIO.getSaveFileName(primaryStage);
    if (fileName.equals("")) {
        return ;
    }
    chess.ChessIO.printToFile(fileName, history, notationHistory);
}