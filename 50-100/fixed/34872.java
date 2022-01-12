private void resetHand() {
    for (int i = 0; i < (handCardSelected.length); i++) {
        if (handCardSelected[i]) {
            double oldTopAnchor = javafx.scene.layout.AnchorPane.getTopAnchor(handCards[i]);
            javafx.scene.layout.AnchorPane.setTopAnchor(handCards[i], (oldTopAnchor + 20));
            handCardSelected[i] = false;
            (numberHandCardSelected)--;
        }
    }
}