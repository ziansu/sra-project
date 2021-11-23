public void playGame() {
    ballPaneA = new musicgame.MusicGame.MusicPaneA(scene, ScoreBoard, ComboBoard);
    javafx.scene.layout.HBox hBox = new javafx.scene.layout.HBox(10);
    hBox.setAlignment(javafx.geometry.Pos.CENTER);
    ballPaneA.setOnMousePressed(( e) -> ballPaneA.pause());
    ballPaneA.setOnMouseReleased(( e) -> ballPaneA.play());
    pane.setCenter(ballPaneA);
    pane.setBottom(hBox);
}