@javafx.fxml.FXML
private void clearShoppingBagButtonPressed(javafx.event.ActionEvent event) {
    undoButton.setVisible(true);
    int len = main.iMat.getShoppingCart().getItems().size();
    int index = 0;
    while ((len--) > 0) {
        java.lang.System.out.println("loop");
        deletedContent.add(main.iMat.getShoppingCart().getItems().get(index));
    } 
    main.iMat.getShoppingCart().clear();
    updateShoppingBagGrid();
}