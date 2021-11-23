@javafx.fxml.FXML
protected void gridGameBoard_click(javafx.scene.input.MouseEvent event) {
    java.lang.System.out.println("Game board clicked at location: ");
    iv = new javafx.scene.image.ImageView("resources/Cross.png");
    gridGameBoard.add(iv, 0, 0);
}