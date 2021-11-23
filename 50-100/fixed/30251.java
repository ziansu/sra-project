@java.lang.Override
public void handle(javafx.event.ActionEvent e) {
    new java.lang.Thread(() -> {
        try {
            observableCard.set(null);
            observableCard.set(graphicsObjects.CardSelectionPane.getCard(this, ((javafx.stage.Stage) (graphicPane.getScene().getWindow()))));
        } catch (exceptions.CardNotFoundException ex) {
            chat.ChatStream.print("No cards in collection", MessageInfo.SYSTEM);
        }
    }).start();
}