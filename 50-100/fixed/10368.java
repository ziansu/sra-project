public void createTransactionWindow() {
    transactionStage = new javafx.stage.Stage();
    isTransactionWindowActive = true;
    javafx.scene.layout.BorderPane borderRoot = new javafx.scene.layout.BorderPane();
    borderRoot.setTop(transactionsMenuBar());
    updateTransactionLabel();
    borderRoot.setCenter(transactionLabel);
    transactionStage.setTitle("Transactions");
    transactionStage.setScene(new javafx.scene.Scene(borderRoot, 450, 450));
    transactionStage.setX(100);
    transactionStage.setY(50);
    transactionStage.show();
}